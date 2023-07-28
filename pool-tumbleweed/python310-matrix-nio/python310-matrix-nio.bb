SUMMARY = "A Python Matrix client library, designed according to sans I/O principles"
DESCRIPTION = "A Python Matrix client library, designed according to sans I/O principles."
LICENSE = "ISC"

PV = "0.20.2"

RPM_NAME = "python310-matrix-nio-0.20.2-1.1.noarch.rpm"
RPM_HASH = "99b9179697df28d683e286cd28dda14aacff618b56e18946868f2c2be9a51994d305a0e0c97aaa01579738fb0ca578b4a1a0552eac748a8f486dccdead717dfd"
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
