SUMMARY = "Bogofilter libdb backend"
DESCRIPTION = "This package contains bogofilter build with the libdb backend."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.4"

RPM_NAME = "bogofilter-db-1.2.4-15.12.aarch64.rpm"
RPM_HASH = "c1670e91baa68c82d64d587ae33dd97afb21665d5672e159c66c42527c30911feb19a2eac420638df3017e24fe2962efc634f59151d442eb1e22d194e01af53d"

RPROVIDES:${PN} += "bogofilter \
bogofilter-backend \
bogofilter-db \
bogofilter-db(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
bogofilter-common \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.36)(64bit) \
libdb-4.8.so()(64bit) \
libgsl.so.27()(64bit) \
libgslcblas.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
update-alternatives"

inherit rpm
