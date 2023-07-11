SUMMARY = "A Python Matrix client library, designed according to sans I/O principles"
DESCRIPTION = "A Python Matrix client library, designed according to sans I/O principles."
LICENSE = "ISC"

PV = "0.19.0"

RPM_NAME = "python311-matrix-nio-0.19.0-1.13.noarch.rpm"
RPM_HASH = "18ecc51117801e1b0cee67ee08b4fc1c5774279c618add10005c99ab17970b0c01b52d689cfe652f6861e574b9c2a44764aaee6d7052785ec14ece749c76a349"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-matrix-nio \
python3.11dist-matrix-nio \
python311-matrix-nio \
python3dist-matrix-nio"

RDEPENDS:${PN} += "python-abi \
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
