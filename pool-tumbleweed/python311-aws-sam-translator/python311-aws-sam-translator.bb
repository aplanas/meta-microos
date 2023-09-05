SUMMARY = "AWS SAM template to AWS CloudFormation template translator"
DESCRIPTION = "AWS SAM Translator is a library that transform SAM \
templates into AWS CloudFormation templates"
LICENSE = "Apache-2.0"

PV = "1.71.0"

RPM_NAME = "python311-aws-sam-translator-1.71.0-1.1.noarch.rpm"
RPM_HASH = "4eb464bf5789663f1c4beed3b4c8b5352e63579f7d6b62ecf53cb4772b9b7f696b15e6ff860edf6b05b5a30df3acc115f2d412fb5d8478f564de7aaaa20a9beb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-sam-translator \
python3.11dist-aws-sam-translator \
python311-aws-sam-translator \
python3dist-aws-sam-translator"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-boto3 \
python311-jsonschema \
python311-pydantic \
update-alternatives"

inherit rpm
