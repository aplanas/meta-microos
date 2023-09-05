SUMMARY = "AWS SAM template to AWS CloudFormation template translator"
DESCRIPTION = "AWS SAM Translator is a library that transform SAM \
templates into AWS CloudFormation templates"
LICENSE = "Apache-2.0"

PV = "1.71.0"

RPM_NAME = "python310-aws-sam-translator-1.71.0-1.1.noarch.rpm"
RPM_HASH = "584dce0ab27756eb7487a374ac867fe9d1811a1bf1adf2e0f8d022d034bef03a5adf2ed77b13d34f388803876897b144377143e29c474d478a2063758d8e6d0d"
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
