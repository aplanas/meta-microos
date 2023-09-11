SUMMARY = "Tool to checks cloudformation for practices and behaviour"
DESCRIPTION = "Validate CloudFormation yaml/json templates against the CloudFormation \
spec and additional checks. Includes checking valid values for \
resource properties and best practices."
LICENSE = "MIT"

PV = "0.79.8"

RPM_NAME = "python310-cfn-lint-0.79.8-1.1.noarch.rpm"
RPM_HASH = "ed0e22b51ed35f94cc8a81268d2c625a194b1706283a209f9fd26710d659bbad011ca65fb55703f27d6ea194034919fd86ddce16132d6d773d3941bc18ef9518"
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
python310-regex \
python310-sarif-om \
python310-sympy \
update-alternatives"

inherit rpm
