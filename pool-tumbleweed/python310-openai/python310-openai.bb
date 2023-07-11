SUMMARY = "OpenAI bindings for python"
DESCRIPTION = "The OpenAI Python library provides convenient access to the OpenAI API \
from applications written in the Python language. It includes a \
pre-defined set of classes for API resources that initialize \
themselves dynamically from API responses which makes it compatible \
with a wide range of versions of the OpenAI API. \
 \
You can find usage examples for the OpenAI Python library in \
 https://beta.openai.com/docs/api-reference?lang=python \
 https://github.com/openai/openai-cookbook/."
LICENSE = "MIT"

PV = "0.26.2"

RPM_NAME = "python310-openai-0.26.2-1.7.noarch.rpm"
RPM_HASH = "3547c9a730edaaa9bb5db8c2d2e7e6f61cd4c0a8be7a94c2d19903514f8d738d4e99a570be486a2ad5fbba605be582857ac685d34664e42fbdf87c01b4413a9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-openai \
python310-openai \
python3dist-openai"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-aiohttp \
python310-requests \
python310-tqdm \
update-alternatives"

inherit rpm
