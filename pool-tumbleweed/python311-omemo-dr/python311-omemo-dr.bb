SUMMARY = "OMEMO Encryption Library"
DESCRIPTION = "Python library for handling OMEMO encryption."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "python311-omemo-dr-1.0.0-1.2.aarch64.rpm"
RPM_HASH = "8491e2127f6d6597ab40ad6b2bced125372fd9664b7cae1196a655b5bf239242c2a86889a7bacee6f296ca9289b83bf5be542c41858daaea5e664ae764c2fd92"

RPROVIDES:${PN} += "python3-omemo-dr \
python3.11dist-omemo-dr \
python311-omemo-dr \
python3dist-omemo-dr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python3.11dist-cryptography \
python3.11dist-protobuf \
python311-cryptography \
python311-protobuf"

inherit rpm
