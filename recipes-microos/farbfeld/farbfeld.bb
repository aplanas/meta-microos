SUMMARY = "Farbfeld image conversion tools"
DESCRIPTION = "Tools for converting images into and from the suckless.org farbfeld \
format, which is practically the same as the Netpbm P7 RGB_ALPHA \
format, only with a custom header."
LICENSE = "ISC"

PV = "4"

RPM_NAME = "farbfeld-4-2.3.aarch64.rpm"
RPM_HASH = "975e5bde85e6ea47e70a7c268034b9015520d6c96a136a03a26403d58c057c5de0a1ffef4406631025994eca0e2703fa87a1967cbe9c162555ded43d082c9bfe"

RPROVIDES:${PN} += "farbfeld farbfeld(aarch-64)"
RDEPENDS:${PN} += "/bin/sh libc.so.6(GLIBC_2.34)(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit)"

inherit rpm
