SUMMARY = "3D printer control software"
DESCRIPTION = "libSavitar is a C++ implementation of 3mf loading with SIP python bindings."
LICENSE = "LGPL-3.0-only"

PV = "4.13.1"

RPM_NAME = "libSavitar0-4.13.1-2.8.aarch64.rpm"
RPM_HASH = "2e4abb456a416c9f6410813d4fbbc8b7db691f804570768949fdafcbee4e83448ec0e74bbe52e9f5970ef8009337b350074930a3aaf733fc33c5618b49df9d09"

RPROVIDES:${PN} += "libSavitar.so.0 \
libSavitar0 \
python3-Savitar"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpugixml.so.1 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
python-abi \
python3-qt5-sip"

inherit rpm
