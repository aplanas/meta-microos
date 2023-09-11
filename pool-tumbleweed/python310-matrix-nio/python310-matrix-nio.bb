SUMMARY = "A Python Matrix client library, designed according to sans I/O principles"
DESCRIPTION = "A Python Matrix client library, designed according to sans I/O principles."
LICENSE = "ISC"

PV = "0.21.2"

RPM_NAME = "python310-matrix-nio-0.21.2-1.1.noarch.rpm"
RPM_HASH = "838475b3082c4c0600ebdfb24cb9198de50ac01b62b51612491388145878d63857291654ebae0614dd5b56c6d2d9aca79d2660f74fb80eba1c64726941045898"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-matrix-nio \
python310-matrix-nio \
python3dist-matrix-nio"

RDEPENDS:${PN} += "python-abi \
python310-aiofiles \
python310-aiohttp \
python310-aiohttp-socks \
python310-h11 \
python310-h2 \
python310-jsonschema \
python310-pycryptodome \
python310-unpaddedbase64"

inherit rpm
