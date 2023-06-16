SUMMARY = "AWS SAM template to AWS CloudFormation template translator"
DESCRIPTION = "AWS SAM Translator is a library that transform SAM \
templates into AWS CloudFormation templates"
LICENSE = "Apache-2.0"

PV = "1.55.0"

RPM_NAME = "python39-aws-sam-translator-1.55.0-1.4.noarch.rpm"
RPM_HASH = "28720848c2ea99671d7c9ff8fc0ce2f9170d22fd3c7cd68318eb3e2f2ee778dccca7680868d6b0cceecb8f46a17d370988a6b5a70f209dede7cdcf2dd799bea3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-aws-sam-translator \
python39-aws-sam-translator \
python3dist-aws-sam-translator"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-boto3 \
python39-jsonschema \
update-alternatives"

inherit rpm
