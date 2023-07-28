SUMMARY = "A Python Matrix client library, designed according to sans I/O principles"
DESCRIPTION = "A Python Matrix client library, designed according to sans I/O principles."
LICENSE = "ISC"

PV = "0.20.2"

RPM_NAME = "python311-matrix-nio-0.20.2-1.1.noarch.rpm"
RPM_HASH = "43e4677cbac68759c52d39b3f4f4271f3528dcfe0ee6121b64f3c43c560c33f027c5ae77205c6c30ec33bc2f6b1c0ccd7ef1c775b37dc8b219f6ee3aece6b886"
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
