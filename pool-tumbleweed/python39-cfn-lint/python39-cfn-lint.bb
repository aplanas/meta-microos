SUMMARY = "Tool to checks cloudformation for practices and behaviour"
DESCRIPTION = "Validate CloudFormation yaml/json templates against the CloudFormation \
spec and additional checks. Includes checking valid values for \
resource properties and best practices."
LICENSE = "MIT"

PV = "0.72.10"

RPM_NAME = "python39-cfn-lint-0.72.10-1.7.noarch.rpm"
RPM_HASH = "64c6aece413daacd218a8e0d1858804858b1740627ea5c24c32f40122ddc2ddc67bd0984f45604b54831e22c140d2ee9774731cd53009a07465006d1f8a82061"
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
python39-sarif-om \
update-alternatives"

inherit rpm
