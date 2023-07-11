SUMMARY = "Tools from libgsf, a structured file formats handling library"
DESCRIPTION = "The libgsf library is an extensible I/O abstraction library for dealing \
with structured file formats."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.14.50"

RPM_NAME = "libgsf-tools-1.14.50-1.6.aarch64.rpm"
RPM_HASH = "8cf949a105627b066d54a75144245833659247880ae377b439806679fce1d2218632078a0a23c0930140ce2df5435984a2d3e53d5ce5e03a3e350d86e873c577"

RPROVIDES:${PN} += "libgsf-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgsf-1.so.114"

inherit rpm
