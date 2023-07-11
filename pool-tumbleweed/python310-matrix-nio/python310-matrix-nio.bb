SUMMARY = "A Python Matrix client library, designed according to sans I/O principles"
DESCRIPTION = "A Python Matrix client library, designed according to sans I/O principles."
LICENSE = "ISC"

PV = "0.19.0"

RPM_NAME = "python310-matrix-nio-0.19.0-1.13.noarch.rpm"
RPM_HASH = "94f26d823870db83fc953b91fb37d39bfb47ecb9adcc33d2e8ae2c929013957eb80570f3390bade5967f4114a524eacd76bbfc8605c9e291473c23a262a74b7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-matrix-nio \
python310-matrix-nio \
python3dist-matrix-nio"

RDEPENDS:${PN} += "python-abi \
python310-Logbook \
python310-aiofiles \
python310-aiohttp \
python310-aiohttp-socks \
python310-future \
python310-h11 \
python310-h2 \
python310-jsonschema \
python310-pycryptodome \
python310-unpaddedbase64"

inherit rpm
