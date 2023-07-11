SUMMARY = "The GNU Compiler Collection targeting ppc64le"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting ppc64le. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-ppc64le-gcc7-7.5.0+r278197-14.2.aarch64.rpm"
RPM_HASH = "de72495a5f931f2ab90dc2d52f55fbf6de42f952ee426ad44576d394e8f2e8a925ce9738078c1925c031ae53156e806c88c7bde38cd897a8c4145b8cc4e3a6d0"

RPROVIDES:${PN} += "cross-ppc64le-gcc7 \
liblto-plugin.so.0"

RDEPENDS:${PN} += "/usr/bin/sh \
cross-ppc64le-binutils \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
