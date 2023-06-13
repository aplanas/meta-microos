SUMMARY = "3D printer control software"
DESCRIPTION = "CuraEngine is an engine for processing 3D models into 3D printing \
instruction for Ultimaker and other GCode-based 3D printers. \
It is part of the larger project called 'Cura'."
LICENSE = "AGPL-3.0-only"

PV = "4.13.1"

RPM_NAME = "cura-engine-4.13.1-2.1.aarch64.rpm"
RPM_HASH = "cc19335885766ef54e7a8b0d803c562d14c845838a3d4a5acbc2eca6f4a53efaab7e7c4996598354c86678ac691905e6d63b870f2f1899298e4890fd07423dde"

RPROVIDES:${PN} += "cura-engine \
cura-engine(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libArcus.so.3()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgomp.so.1()(64bit) \
libm.so.6()(64bit) \
libpolyclipping.so.22()(64bit) \
libprotobuf-3.21.12.so()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
