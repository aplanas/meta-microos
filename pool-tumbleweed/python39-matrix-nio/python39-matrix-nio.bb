SUMMARY = "A Python Matrix client library, designed according to sans I/O principles"
DESCRIPTION = "A Python Matrix client library, designed according to sans I/O principles."
LICENSE = "ISC"

PV = "0.19.0"

RPM_NAME = "python39-matrix-nio-0.19.0-1.11.noarch.rpm"
RPM_HASH = "73d8dac039c1e1c88020bdedc682066fd87ee4fd08dbce52b05a0a4b8136023c151bbbfb4deb2e295ea736ceb0571a3784aa45e0d567e857874a79912b43931d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(matrix-nio) \
python39-matrix-nio \
python3dist(matrix-nio)"

RDEPENDS:${PN} += "python(abi) \
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
