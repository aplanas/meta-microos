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

RPM_NAME = "python311-openai-0.26.2-1.7.noarch.rpm"
RPM_HASH = "d91e5c97260fd45b4e24311bd1d1d1e21f0eab3d39920abbcfda69aa094e4decf5b7c3ca0fe8970e60dadd3339df6caebb7bd207ebe717f0ad4fcb34f2fb9e80"
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
