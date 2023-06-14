SUMMARY = "Python bindings for libArcus"
DESCRIPTION = "Python bindings for the Arcus communication library."
LICENSE = "LGPL-3.0-only"

PV = "4.13.1"

RPM_NAME = "python3-Arcus-4.13.1-3.12.aarch64.rpm"
RPM_HASH = "bf92b6628466c99bd202867c148f0292dddde4e58576ea9f1100a60ab58e02b6cb29e0c4257c8063e1dbc87b944d6aae9dc70feb3674a4aba8c3db72be9d2485"

RPROVIDES:${PN} += "python3-Arcus \
python3.10dist-arcus \
python3dist-arcus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libArcus-Ultimaker \
libArcus.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libprotobuf-3.21.12.so \
libstdc++.so.6 \
python-abi \
python3-qt5-sip"

inherit rpm
