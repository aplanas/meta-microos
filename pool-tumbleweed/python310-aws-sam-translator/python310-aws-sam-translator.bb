SUMMARY = "AWS SAM template to AWS CloudFormation template translator"
DESCRIPTION = "AWS SAM Translator is a library that transform SAM \
templates into AWS CloudFormation templates"
LICENSE = "Apache-2.0"

PV = "1.55.0"

RPM_NAME = "python310-aws-sam-translator-1.55.0-1.4.noarch.rpm"
RPM_HASH = "69823b136294c8c1f3cbbd0c5611cefaebf35bf71e3c62cc0981f4996d2e54227a7fb63abad30779042150ac9d3efd6fe36498973708e239f293f0ab9d3c04b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aws-sam-translator \
python3.10dist(aws-sam-translator) \
python310-aws-sam-translator \
python3dist(aws-sam-translator)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-boto3 \
python310-jsonschema \
update-alternatives"

inherit rpm
