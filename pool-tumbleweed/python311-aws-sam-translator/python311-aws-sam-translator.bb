SUMMARY = "AWS SAM template to AWS CloudFormation template translator"
DESCRIPTION = "AWS SAM Translator is a library that transform SAM \
templates into AWS CloudFormation templates"
LICENSE = "Apache-2.0"

PV = "1.55.0"

RPM_NAME = "python311-aws-sam-translator-1.55.0-1.4.noarch.rpm"
RPM_HASH = "571683c81f62c461660fd464eda5c05ed6ce4bce6e46395cfb5e3a4ecadc985acc078749e5cf31161261b2a01ea710a21cdabfd056a43fa21ec972cfd69aee97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-aws-sam-translator \
python311-aws-sam-translator \
python3dist-aws-sam-translator"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-boto3 \
python311-jsonschema \
update-alternatives"

inherit rpm
