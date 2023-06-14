SUMMARY = "Electromagnetic field solver library"
DESCRIPTION = "Electromagnetic field solver using the EC-FDTD method library."
LICENSE = "GPL-3.0-only"

PV = "0.0.35"

RPM_NAME = "libopenEMS0-0.0.35-5.36.aarch64.rpm"
RPM_HASH = "2ff1665b08dbce441c1af00fa6617b2054ada45a84df7d1989ec0bf4f7ca9aa6b0cfd554e09ff906869502344cfbd31f2034fd750a1d13001a6cf770e2aadff8"

RPROVIDES:${PN} += "libopenEMS.so.0 \
libopenEMS0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libCSXCAD.so.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libfparser-4.5.2.so \
libgcc-s.so.1 \
libhdf5.so.200 \
libm.so.6 \
libstdc++.so.6 \
libtinyxml.so.0 \
libvtkCommonCore.so.1 \
libvtkCommonDataModel.so.1 \
libvtkIOCore.so.1 \
libvtkIOLegacy.so.1 \
libvtkIOXML.so.1 \
libvtksys.so.1"

inherit rpm
