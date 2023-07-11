SUMMARY = "Load and dump data from json-like format into typed data structures"
DESCRIPTION = "Load and dump data from json-like format into typed data structures"
LICENSE = "GPL-3.0-only"

PV = "2.19"

RPM_NAME = "python310-typedload-2.19-1.5.noarch.rpm"
RPM_HASH = "9d2551ea9d75692920d44ae3fc0eea6246d2fca5aae2810abf8d66588d779ceddd3d60b6a94bd82fa6946f86a9396883557b10550b20d33ce583b72e3692db12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-typedload \
python310-typedload \
python3dist-typedload"

RDEPENDS:${PN} += "python-abi"

inherit rpm
