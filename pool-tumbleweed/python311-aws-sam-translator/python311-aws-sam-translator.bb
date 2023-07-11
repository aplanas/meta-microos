SUMMARY = "AWS SAM template to AWS CloudFormation template translator"
DESCRIPTION = "AWS SAM Translator is a library that transform SAM \
templates into AWS CloudFormation templates"
LICENSE = "Apache-2.0"

PV = "1.68.0"

RPM_NAME = "python311-aws-sam-translator-1.68.0-1.1.noarch.rpm"
RPM_HASH = "a04b4326624ba26508557d12cd35e3029719374b4df550b4e7b11b54e0d83f572600ee50fa754316e38526c20b938377e52776c564fe0f37b3e7ba14f3af58cc"
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
