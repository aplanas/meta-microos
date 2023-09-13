SUMMARY = "AWS SAM template to AWS CloudFormation template translator"
DESCRIPTION = "AWS SAM Translator is a library that transform SAM \
templates into AWS CloudFormation templates"
LICENSE = "Apache-2.0"

PV = "1.74.0"

RPM_NAME = "python310-aws-sam-translator-1.74.0-1.1.noarch.rpm"
RPM_HASH = "deaa5bac705a59683a82aec2e301e4263bd4351ae224d51dfb7d679085ea58daff3540470e6df98bf2615dc7c794fe73968166bffe83a198709617852883f635"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-aws-sam-translator \
python310-aws-sam-translator \
python3dist-aws-sam-translator"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-boto3 \
python310-jsonschema \
python310-pydantic \
update-alternatives"

inherit rpm
