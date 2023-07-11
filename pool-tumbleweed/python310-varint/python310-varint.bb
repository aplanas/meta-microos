SUMMARY = "Library for encoding variable length integer data"
DESCRIPTION = "varints are a common encoding for variable length integer data, \
used in libraries such as sqlite, protobuf, v8, and more."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python310-varint-1.0.2-1.13.noarch.rpm"
RPM_HASH = "ecfb67b4d1fca7142bb68d5c766dba1ab5cdda7993a1dafdedc9b73c057a28c32bf30a2e0d5b885d2aeed9e65101cf78bcc5f6b868a5b4b392f8a1627cc817da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-varint \
python310-varint \
python3dist-varint"

RDEPENDS:${PN} += "python-abi"

inherit rpm
