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

RPM_NAME = "python310-openai-0.27.8-1.1.noarch.rpm"
RPM_HASH = "d22aa06de6df03c2f35752441c2f2c36858bd7aea7e7db08fd9bdf6baacd67e7cab331221b28125a20d307ab77d2e0456a8cdcef0d32edd7c068273885e49a6a"
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
