SUMMARY = "Tool to checks cloudformation for practices and behaviour"
DESCRIPTION = "Validate CloudFormation yaml/json templates against the CloudFormation \
spec and additional checks. Includes checking valid values for \
resource properties and best practices."
LICENSE = "MIT"

PV = "0.79.9"

RPM_NAME = "python39-cfn-lint-0.79.9-1.1.noarch.rpm"
RPM_HASH = "6c2901c577205b301b24ea3a908c7941139964f2fae4f1ed37b0cc986a234897d181bf61701adecb75a12bd86841df9376cc742e65da8fb05f61d319fe6cf9da"
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
