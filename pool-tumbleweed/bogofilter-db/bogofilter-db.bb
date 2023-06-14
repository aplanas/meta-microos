SUMMARY = "Bogofilter libdb backend"
DESCRIPTION = "This package contains bogofilter build with the libdb backend."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.4"

RPM_NAME = "bogofilter-db-1.2.4-15.12.aarch64.rpm"
RPM_HASH = "c1670e91baa68c82d64d587ae33dd97afb21665d5672e159c66c42527c30911feb19a2eac420638df3017e24fe2962efc634f59151d442eb1e22d194e01af53d"

RPROVIDES:${PN} += "bogofilter \
bogofilter-backend \
bogofilter-db"

RDEPENDS:${PN} += "/bin/sh \
bogofilter-common \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdb-4.8.so \
libgsl.so.27 \
libgslcblas.so.0 \
libm.so.6 \
update-alternatives"

inherit rpm
