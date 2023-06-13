SUMMARY = "Tool to checks cloudformation for practices and behaviour"
DESCRIPTION = "Validate CloudFormation yaml/json templates against the CloudFormation \
spec and additional checks. Includes checking valid values for \
resource properties and best practices."
LICENSE = "MIT"

PV = "0.72.10"

RPM_NAME = "python310-cfn-lint-0.72.10-1.5.noarch.rpm"
RPM_HASH = "7eb6fbee4c7728ed1234cef4e233706520189d392999dc9fe487d576ac98f9f70d795d85db3fc0a9b2f5eff995cc0d2c4cdc5b10f5c964bbeaed09299e5b6bbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cfn-lint \
python3-cfn-lint \
python3.10dist(cfn-lint) \
python310-cfn-lint \
python3dist(cfn-lint)"

RDEPENDS:${PN} += "(python310-jsonschema > 3.0 with python310-jsonschema < 5) \
/bin/sh \
/usr/bin/python3.10 \
git-core \
python(abi) \
python310-PyYAML \
python310-aws-sam-translator \
python310-jschema-to-python \
python310-jsonpatch \
python310-junit-xml \
python310-networkx \
python310-sarif-om \
update-alternatives"

inherit rpm
