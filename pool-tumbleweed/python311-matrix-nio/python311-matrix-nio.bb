SUMMARY = "A Python Matrix client library, designed according to sans I/O principles"
DESCRIPTION = "A Python Matrix client library, designed according to sans I/O principles."
LICENSE = "ISC"

PV = "0.21.2"

RPM_NAME = "python311-matrix-nio-0.21.2-1.1.noarch.rpm"
RPM_HASH = "e5b22dd4d690179bfc9e5771ba65a87c08ba74f707af64bb3da2f447da063c67f947555ea7b63a90b6afc17538086caaad5c20388216ba40e88658d84e15af22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-matrix-nio \
python3.11dist-matrix-nio \
python311-matrix-nio \
python3dist-matrix-nio"

RDEPENDS:${PN} += "python-abi \
python311-aiofiles \
python311-aiohttp \
python311-aiohttp-socks \
python311-h11 \
python311-h2 \
python311-jsonschema \
python311-pycryptodome \
python311-unpaddedbase64"

inherit rpm
