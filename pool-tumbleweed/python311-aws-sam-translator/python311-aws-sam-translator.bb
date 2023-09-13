SUMMARY = "AWS SAM template to AWS CloudFormation template translator"
DESCRIPTION = "AWS SAM Translator is a library that transform SAM \
templates into AWS CloudFormation templates"
LICENSE = "Apache-2.0"

PV = "1.74.0"

RPM_NAME = "python311-aws-sam-translator-1.74.0-1.1.noarch.rpm"
RPM_HASH = "7671e134a59c9d5181b721fb15772d0b0a65ee88a7a765003519f3f089a2a6885bc152c2d553a2843739ee9e9e976cba3c6819a4ec012ca16d36083e34f7fdc4"
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
