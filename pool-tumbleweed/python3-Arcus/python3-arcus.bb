SUMMARY = "Python bindings for libArcus"
DESCRIPTION = "Python bindings for the Arcus communication library."
LICENSE = "LGPL-3.0-only"

PV = "4.13.1"

RPM_NAME = "python3-Arcus-4.13.1-4.1.aarch64.rpm"
RPM_HASH = "c4f8e85c95a71c48c742ada6d51728547e58c4139ea612255f8c6020bdae40e129294b9432704865e5063a11b807598cbd40f17835bcd3ed44423b0ee0ed6efb"

RPROVIDES:${PN} += "python3-Arcus \
python3.11dist-arcus \
python3dist-arcus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libArcus-Ultimaker \
libArcus.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libprotobuf.so.23.3.0 \
libstdc++.so.6 \
python-abi \
python3-qt5-sip"

inherit rpm
