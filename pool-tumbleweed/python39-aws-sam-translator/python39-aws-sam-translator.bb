SUMMARY = "AWS SAM template to AWS CloudFormation template translator"
DESCRIPTION = "AWS SAM Translator is a library that transform SAM \
templates into AWS CloudFormation templates"
LICENSE = "Apache-2.0"

PV = "1.74.0"

RPM_NAME = "python39-aws-sam-translator-1.74.0-1.1.noarch.rpm"
RPM_HASH = "c906bd0a06114d655e7ec604120978454ed0a3c32ca331bcd4c9dfe925a76b376f694e313843c6110ef73aba3791f7b165b20ea1bbc476331dd2a25f759f4a9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-aws-sam-translator \
python39-aws-sam-translator \
python3dist-aws-sam-translator"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-boto3 \
python39-jsonschema \
python39-pydantic \
update-alternatives"

inherit rpm
