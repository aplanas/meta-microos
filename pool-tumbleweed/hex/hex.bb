SUMMARY = "Yet Another Hex Dumper"
DESCRIPTION = "A hex dumper that does CP/M and EBCDIC formatting and has \
internationalization support."
LICENSE = "BSD-3-Clause"

PV = "1.4"

RPM_NAME = "hex-1.4-281.20.aarch64.rpm"
RPM_HASH = "0a5a9b889bae7276ab52c5a99084289e3efe7101be88cd74a41af2394f0c9beb7ee273ab6e1cb040176fd4fc81fef7a464ec56d7757ea988c157a81c9e71b5d0"

RPROVIDES:${PN} += "hex \
util-linux-/usr/bin/hex"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
