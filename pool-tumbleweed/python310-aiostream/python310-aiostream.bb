SUMMARY = "Generator-based operators for asynchronous iteration"
DESCRIPTION = "aiostream provides a collection of stream operators that can be \
combined to create asynchronous pipelines of operations."
LICENSE = "Apache-2.0"

PV = "0.4.5"

RPM_NAME = "python310-aiostream-0.4.5-1.5.noarch.rpm"
RPM_HASH = "ffe9d4839a9f2a37e3a22c99af49c6d8ece9f1c2e5cdae360e63433d4ba14d096f97439dc804f9a52ec640b63531c9a5729c8fd83f47674fc2151f5116379a9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-aiostream \
python310-aiostream \
python3dist-aiostream"

RDEPENDS:${PN} += "python-abi \
python310-siosocks"

inherit rpm
