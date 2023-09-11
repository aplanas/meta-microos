SUMMARY = "Tool to checks cloudformation for practices and behaviour"
DESCRIPTION = "Validate CloudFormation yaml/json templates against the CloudFormation \
spec and additional checks. Includes checking valid values for \
resource properties and best practices."
LICENSE = "MIT"

PV = "0.79.8"

RPM_NAME = "python311-cfn-lint-0.79.8-1.1.noarch.rpm"
RPM_HASH = "15de2840d359b9c08be699ecab03f30a6c74cd33bc858e1c49f15df4d6e5dca2219f5658f05f110c17b7ad00b0f89064e03e21f60dcb107fbeebedb106ba127b"
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
python311-regex \
python311-sarif-om \
python311-sympy \
update-alternatives"

inherit rpm
