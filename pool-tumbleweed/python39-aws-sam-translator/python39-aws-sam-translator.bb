SUMMARY = "AWS SAM template to AWS CloudFormation template translator"
DESCRIPTION = "AWS SAM Translator is a library that transform SAM \
templates into AWS CloudFormation templates"
LICENSE = "Apache-2.0"

PV = "1.68.0"

RPM_NAME = "python39-aws-sam-translator-1.68.0-1.1.noarch.rpm"
RPM_HASH = "cf2794738ed933b3d3ae6dbc8e44ddbb90b00b2a1d0203ea2584f5516eeead0afe4c73e91ef217574708fee7f7a4229b1230965405e36148010002f25d8c5a99"
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
