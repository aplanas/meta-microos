SUMMARY = "A Python Matrix client library, designed according to sans I/O principles"
DESCRIPTION = "A Python Matrix client library, designed according to sans I/O principles."
LICENSE = "ISC"

PV = "0.20.2"

RPM_NAME = "python39-matrix-nio-0.20.2-1.1.noarch.rpm"
RPM_HASH = "9529b9d3c56bc40b97206b7e9113062c4e749b55338e7172758ae8af30dc36a16b1cdd9d65251fbb7d3f9b6cc7be571f53b6e210f3e5bf42c32199403a309f1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-matrix-nio \
python39-matrix-nio \
python3dist-matrix-nio"

RDEPENDS:${PN} += "python-abi \
python39-Logbook \
python39-aiofiles \
python39-aiohttp \
python39-aiohttp-socks \
python39-future \
python39-h11 \
python39-h2 \
python39-jsonschema \
python39-pycryptodome \
python39-unpaddedbase64"

inherit rpm
