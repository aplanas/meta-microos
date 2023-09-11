SUMMARY = "Tool to checks cloudformation for practices and behaviour"
DESCRIPTION = "Validate CloudFormation yaml/json templates against the CloudFormation \
spec and additional checks. Includes checking valid values for \
resource properties and best practices."
LICENSE = "MIT"

PV = "0.79.8"

RPM_NAME = "python39-cfn-lint-0.79.8-1.1.noarch.rpm"
RPM_HASH = "9219374dbc4033c8f2553013853c0fc3e66fd9b9e118e6b4e3a6ae77444fbb85797c07dc1e43f9c586d197f8346dea7077beb7ea855b8d19b24acfe91c42e075"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cfn-lint \
python3.9dist-cfn-lint \
python39-cfn-lint \
python3dist-cfn-lint"

RDEPENDS:${PN} += "-python39-jsonschema > 3.0 with python39-jsonschema < 5 \
/usr/bin/python3.9 \
/usr/bin/sh \
git-core \
python-abi \
python39-PyYAML \
python39-aws-sam-translator \
python39-jschema-to-python \
python39-jsonpatch \
python39-junit-xml \
python39-networkx \
python39-regex \
python39-sarif-om \
python39-sympy \
update-alternatives"

inherit rpm
