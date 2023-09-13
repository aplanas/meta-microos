SUMMARY = "Tool to checks cloudformation for practices and behaviour"
DESCRIPTION = "Validate CloudFormation yaml/json templates against the CloudFormation \
spec and additional checks. Includes checking valid values for \
resource properties and best practices."
LICENSE = "MIT"

PV = "0.79.9"

RPM_NAME = "python310-cfn-lint-0.79.9-1.1.noarch.rpm"
RPM_HASH = "6e19ce5e3837bb00deb569ce81386949b94a01c41bfccb4a73937a4966f828ad1e76f37bcab9819febd041a6a3ed70bbca320ec092caebf5d85dd92101471631"
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
