SUMMARY = "A Python Matrix client library, designed according to sans I/O principles"
DESCRIPTION = "A Python Matrix client library, designed according to sans I/O principles."
LICENSE = "ISC"

PV = "0.19.0"

RPM_NAME = "python39-matrix-nio-0.19.0-1.13.noarch.rpm"
RPM_HASH = "9a24fd3f112d26c503862e392609e66e66b4e8623eada647dafba141df53671975ae131a3bb835f53fae70f6e6881662ce6cf1f49a21c9ea21452553bd6e9670"
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
