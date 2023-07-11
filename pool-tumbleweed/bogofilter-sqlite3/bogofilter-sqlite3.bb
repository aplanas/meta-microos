SUMMARY = "Bogofilter sqlite3 backend"
DESCRIPTION = "This package contains bogofilter build with the sqlite3 backend."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.4"

RPM_NAME = "bogofilter-sqlite3-1.2.4-15.13.aarch64.rpm"
RPM_HASH = "542322f9a2dac69f54d0462d28c12900e030120a408c77c2a4e53d5ae2d40a0338e89dd33b7f3985b8159d01c97184a5d610efbddddfd138af32e1869d673f99"

RPROVIDES:${PN} += "bogofilter-backend \
bogofilter-sqlite3"

RDEPENDS:${PN} += "/usr/bin/sh \
bogofilter-common \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgsl.so.27 \
libgslcblas.so.0 \
libm.so.6 \
libsqlite3.so.0 \
update-alternatives"

inherit rpm
