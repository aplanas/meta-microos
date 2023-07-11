SUMMARY = "Statistical, numerical and textual operations in the command line"
DESCRIPTION = "GNU datamash is a command-line program which performs basic numeric, \
textual and statistical operations on input textual data files."
LICENSE = "GPL-3.0-or-later"

PV = "1.8"

RPM_NAME = "datamash-1.8-1.10.aarch64.rpm"
RPM_HASH = "5f03349180d3284bf5f808c0cdb67d67308790426257c261025652b71ff071ffe89cfadfb9a037c9e8d7c05823c4df7e833c280c7c7cb0ecaef761abbcfe6d58"

RPROVIDES:${PN} += "datamash"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6"

inherit rpm
