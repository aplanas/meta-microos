SUMMARY = "3D printer control software"
DESCRIPTION = "CuraEngine is an engine for processing 3D models into 3D printing \
instruction for Ultimaker and other GCode-based 3D printers. \
It is part of the larger project called 'Cura'."
LICENSE = "AGPL-3.0-only"

PV = "4.13.1"

RPM_NAME = "cura-engine-4.13.1-2.1.aarch64.rpm"
RPM_HASH = "cc19335885766ef54e7a8b0d803c562d14c845838a3d4a5acbc2eca6f4a53efaab7e7c4996598354c86678ac691905e6d63b870f2f1899298e4890fd07423dde"

RPROVIDES:${PN} += "cura-engine"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libArcus.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libpolyclipping.so.22 \
libprotobuf-3.21.12.so \
libstdc++.so.6"

inherit rpm
