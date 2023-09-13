SUMMARY = "Tool to checks cloudformation for practices and behaviour"
DESCRIPTION = "Validate CloudFormation yaml/json templates against the CloudFormation \
spec and additional checks. Includes checking valid values for \
resource properties and best practices."
LICENSE = "MIT"

PV = "0.79.9"

RPM_NAME = "python311-cfn-lint-0.79.9-1.1.noarch.rpm"
RPM_HASH = "b6ee325115bd574a91c854e405a4e4f2f3a318a007866dffc50412243b17779a3a398a1ca1cf402de108feb450854facf35363d4caf00e295c0feef8c9e468a4"
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
