SUMMARY = "AWS SAM template to AWS CloudFormation template translator"
DESCRIPTION = "AWS SAM Translator is a library that transform SAM \
templates into AWS CloudFormation templates"
LICENSE = "Apache-2.0"

PV = "1.71.0"

RPM_NAME = "python39-aws-sam-translator-1.71.0-1.1.noarch.rpm"
RPM_HASH = "b2eb553c449d6e53322588224a009f5e2b9c49bc26f089ab3d03a55dea17e69fa9ceead8e421169b9dc00283239f3d22950af66b25ee8e8d572fb7c8ee5f8fa3"
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
