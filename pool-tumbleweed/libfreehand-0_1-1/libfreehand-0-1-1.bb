SUMMARY = "Library for parsing the Adobe/Macromedia drawings"
DESCRIPTION = "Libfreehand is library providing ability to interpret and import Adobe/Macromedia \
drawings into various applications. You can find it being used in libreoffice."
LICENSE = "MPL-2.0"

PV = "0.1.2"

RPM_NAME = "libfreehand-0_1-1-0.1.2-2.19.aarch64.rpm"
RPM_HASH = "5816b998e1d72a29ad34faaf1f96112ae585fd8807e5a6b3e77e5f7b02d03abb43ebbd48686e77e60a2f27432bbee8428b934ab4a71fbc4f2525f96a0f368a3d"

RPROVIDES:${PN} += "libfreehand-0-1-1 \
libfreehand-0.1.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblcms2.so.2 \
libm.so.6 \
librevenge-0.0.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
