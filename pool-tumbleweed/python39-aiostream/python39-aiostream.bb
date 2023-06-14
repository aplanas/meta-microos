SUMMARY = "Generator-based operators for asynchronous iteration"
DESCRIPTION = "aiostream provides a collection of stream operators that can be \
combined to create asynchronous pipelines of operations."
LICENSE = "Apache-2.0"

PV = "0.4.5"

RPM_NAME = "python39-aiostream-0.4.5-1.3.noarch.rpm"
RPM_HASH = "2f85ef849b9b587ba76f841aa5366c8147e8db4d9ddfbf533a2c2573e625a7e5bb606fc8412732e9e72f212d7bb48927c77b45d400f7ed16ecdd87751940b9b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-aiostream \
python39-aiostream \
python3dist-aiostream"

RDEPENDS:${PN} += "python-abi \
python39-siosocks"

inherit rpm
