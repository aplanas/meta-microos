SUMMARY = "Bogofilter libdb backend"
DESCRIPTION = "This package contains bogofilter build with the libdb backend."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.4"

RPM_NAME = "bogofilter-db-1.2.4-15.13.aarch64.rpm"
RPM_HASH = "d02f5272fccbe7185e9ce2d114521a3af4b708bd2e7ad99d14d070f3bc818ae4ba21319abcb5dcb9472314fdae7bacb98616b6e3ca4aaa9ec0e9ecf30c0c9cae"

RPROVIDES:${PN} += "bogofilter \
bogofilter-backend \
bogofilter-db"

RDEPENDS:${PN} += "/usr/bin/sh \
bogofilter-common \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdb-4.8.so \
libgsl.so.27 \
libgslcblas.so.0 \
libm.so.6 \
update-alternatives"

inherit rpm
