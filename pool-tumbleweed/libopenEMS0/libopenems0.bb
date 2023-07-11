SUMMARY = "Electromagnetic field solver library"
DESCRIPTION = "Electromagnetic field solver using the EC-FDTD method library."
LICENSE = "GPL-3.0-only"

PV = "0.0.35"

RPM_NAME = "libopenEMS0-0.0.35-5.37.aarch64.rpm"
RPM_HASH = "da0b5a86f85faa44557d124bfa3fec52bd23ecbfe2d9f86956422525afa08243b5bd143cf1a895fe969fb56136d8d40e99e4fc0eeefe9380079ae9a7450edcc1"

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
