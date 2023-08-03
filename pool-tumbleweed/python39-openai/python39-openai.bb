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

RPM_NAME = "python39-openai-0.27.8-1.1.noarch.rpm"
RPM_HASH = "47f13d5af35f60bcb1661554e3e5805d0e64056a1f0c449e3606e08a4fb1ead7e387408517b3fef428f249431e3194676adf43c5f9cad40f570f54e5dadf0867"
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
