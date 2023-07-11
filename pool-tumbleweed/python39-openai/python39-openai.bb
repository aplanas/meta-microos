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

RPM_NAME = "python39-openai-0.26.2-1.7.noarch.rpm"
RPM_HASH = "aa89afa845051f07b446e780cd97e1ce315c16306f5fe535215f9811669db607d768cce070c5fa3e136da6dc932d082233f46a4b83dac20ff8284462caf1fafe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-openai \
python39-openai \
python3dist-openai"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-aiohttp \
python39-requests \
python39-tqdm \
update-alternatives"

inherit rpm
