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

PV = "0.27.8"

RPM_NAME = "python311-openai-0.27.8-1.1.noarch.rpm"
RPM_HASH = "0b427fefd0bd25d1f4e7848a35dc46361df3ff98182b5ceee90164cb3c7f68fa413ed9aa629b69e3db72a3ffdbbfe8c626be9e669f68dfd05728ba03cfb23b2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openai \
python3.11dist-openai \
python311-openai \
python3dist-openai"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-aiohttp \
python311-requests \
python311-tqdm \
update-alternatives"

inherit rpm
