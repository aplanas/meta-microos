SUMMARY = "A Python Matrix client library, designed according to sans I/O principles"
DESCRIPTION = "A Python Matrix client library, designed according to sans I/O principles."
LICENSE = "ISC"

PV = "0.21.2"

RPM_NAME = "python39-matrix-nio-0.21.2-1.1.noarch.rpm"
RPM_HASH = "fb6a942aa9add075a8dcb743448524a6eaeb57037719ff26fe6fb06e098ce0474f61883f8366485545eb054dd5a2f183986339467802d217acf86042f1fc0aae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-matrix-nio \
python39-matrix-nio \
python3dist-matrix-nio"

RDEPENDS:${PN} += "python-abi \
python39-aiofiles \
python39-aiohttp \
python39-aiohttp-socks \
python39-h11 \
python39-h2 \
python39-jsonschema \
python39-pycryptodome \
python39-unpaddedbase64"

inherit rpm
