SUMMARY = "AWS SAM template to AWS CloudFormation template translator"
DESCRIPTION = "AWS SAM Translator is a library that transform SAM \
templates into AWS CloudFormation templates"
LICENSE = "Apache-2.0"

PV = "1.68.0"

RPM_NAME = "python310-aws-sam-translator-1.68.0-1.1.noarch.rpm"
RPM_HASH = "9df1ff9d6380fadf3ee1bf487412340f002b34d150ae05d4d28882c3091582fc70a7f6612fc32cd0b58b93ce6a8b33ea54bfad225d7fc9d527c64a9734faef2f"
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
