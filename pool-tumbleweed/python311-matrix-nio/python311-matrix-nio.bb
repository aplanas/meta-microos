SUMMARY = "A Python Matrix client library, designed according to sans I/O principles"
DESCRIPTION = "A Python Matrix client library, designed according to sans I/O principles."
LICENSE = "ISC"

PV = "0.19.0"

RPM_NAME = "python311-matrix-nio-0.19.0-1.11.noarch.rpm"
RPM_HASH = "e8d478232a56ca23e34b8585e83e6382f775ce274f3b5721ce00f00a0c7bc6e144024efb4f30646d5ac177aa461f34a6deb82d831af4d5ccf81b72d6e6b3515e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(matrix-nio) \
python311-matrix-nio \
python3dist(matrix-nio)"

RDEPENDS:${PN} += "python(abi) \
python311-Logbook \
python311-aiofiles \
python311-aiohttp \
python311-aiohttp-socks \
python311-future \
python311-h11 \
python311-h2 \
python311-jsonschema \
python311-pycryptodome \
python311-unpaddedbase64"

inherit rpm
