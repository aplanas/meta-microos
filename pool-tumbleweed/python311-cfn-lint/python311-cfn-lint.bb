SUMMARY = "Tool to checks cloudformation for practices and behaviour"
DESCRIPTION = "Validate CloudFormation yaml/json templates against the CloudFormation \
spec and additional checks. Includes checking valid values for \
resource properties and best practices."
LICENSE = "MIT"

PV = "0.72.10"

RPM_NAME = "python311-cfn-lint-0.72.10-1.7.noarch.rpm"
RPM_HASH = "448128f889721cf19fa2fa585eb0ca2444734d34362c6af76de79b696e737d90d5501364853c09729ebe8cb5fcbd71d697fdbab617bd2c9820286c36a3ef00df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cfn-lint \
python3-cfn-lint \
python3.11dist-cfn-lint \
python311-cfn-lint \
python3dist-cfn-lint"

RDEPENDS:${PN} += "-python311-jsonschema > 3.0 with python311-jsonschema < 5 \
/usr/bin/python3.11 \
/usr/bin/sh \
git-core \
python-abi \
python311-PyYAML \
python311-aws-sam-translator \
python311-jschema-to-python \
python311-jsonpatch \
python311-junit-xml \
python311-networkx \
python311-sarif-om \
update-alternatives"

inherit rpm
