SUMMARY = "Tool to checks cloudformation for practices and behaviour"
DESCRIPTION = "Validate CloudFormation yaml/json templates against the CloudFormation \
spec and additional checks. Includes checking valid values for \
resource properties and best practices."
LICENSE = "MIT"

PV = "0.72.10"

RPM_NAME = "python310-cfn-lint-0.72.10-1.7.noarch.rpm"
RPM_HASH = "a23abb15fed70763aa5eeeedc0310670a5ddadf0cd2b31797015d73795443b9237314c38f5c5c9cbd6b6077e93d7634e57695244859fb7e03b44079543f98d68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cfn-lint \
python3.10dist-cfn-lint \
python310-cfn-lint \
python3dist-cfn-lint"

RDEPENDS:${PN} += "-python310-jsonschema > 3.0 with python310-jsonschema < 5 \
/usr/bin/python3.10 \
/usr/bin/sh \
git-core \
python-abi \
python310-PyYAML \
python310-aws-sam-translator \
python310-jschema-to-python \
python310-jsonpatch \
python310-junit-xml \
python310-networkx \
python310-sarif-om \
update-alternatives"

inherit rpm
