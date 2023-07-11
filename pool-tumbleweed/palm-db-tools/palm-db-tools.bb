SUMMARY = "convert text files into several PalmOS database formats"
DESCRIPTION = "The palm-db-tools package convert text files to several flat-file \
database formats. The currently supported formats are: DB \
http://pilot-db.sourceforge.net/ MobileDB \
http://www.mobilegeneration.com/products/mobiledb/ List \
http://www.magma.ca/~roo/list/list.html JFile v3.x (v4.x will be \
supported later) http://www.land-j.com/jfile.html"
LICENSE = "GPL-2.0+"

PV = "0.3.6"

RPM_NAME = "palm-db-tools-0.3.6-276.29.aarch64.rpm"
RPM_HASH = "c38b503312f3871b1e932b5bb0270ace7a39b60bd04c5f07c4ae754bfb80ea97d25e20d1a3f9933ba66bed4ab14caf519a5503d7571f6d467bb1a01db57cc4db"

RPROVIDES:${PN} += "libpdbtools.so \
palm-db-tools"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
