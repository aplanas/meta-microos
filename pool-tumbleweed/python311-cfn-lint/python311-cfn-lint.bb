SUMMARY = "Tool to checks cloudformation for practices and behaviour"
DESCRIPTION = "Validate CloudFormation yaml/json templates against the CloudFormation \
spec and additional checks. Includes checking valid values for \
resource properties and best practices."
LICENSE = "MIT"

PV = "0.72.10"

RPM_NAME = "python311-cfn-lint-0.72.10-1.5.noarch.rpm"
RPM_HASH = "29e5fa83eb1b11e0bdf0c96d6e274405a36aa005ab7fe50d0a80b0e904d0574fd0a4592588612fdf5844e7c80d9a8dafb759778b2e0855d590060850da4141d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cfn-lint \
python3.11dist(cfn-lint) \
python311-cfn-lint \
python3dist(cfn-lint)"
RDEPENDS:${PN} += "(python311-jsonschema > 3.0 with python311-jsonschema < 5) \
/bin/sh \
/usr/bin/python3.11 \
git-core \
python(abi) \
python311-PyYAML \
python311-aws-sam-translator \
python311-jschema-to-python \
python311-jsonpatch \
python311-junit-xml \
python311-networkx \
python311-sarif-om \
update-alternatives"

inherit rpm
