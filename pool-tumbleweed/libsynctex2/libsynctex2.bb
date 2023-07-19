SUMMARY = "Libraries of The Synchronization TeXnology"
DESCRIPTION = "The Synchronization TeXnology by Jérôme Laurens is a new feature \
of recent TeX engines.  It allows to synchronize between input \
and output, which means to navigate from the source document to \
the typeset material and vice versa."
LICENSE = "MIT"

PV = "1.21"

RPM_NAME = "libsynctex2-1.21-93.1.aarch64.rpm"
RPM_HASH = "dd6fda22bf6194ac2da50effd95562185be7e66ffa65762e76cde1b0b733cd627ffdd75140b391509664f34c954c3bf913cd65506f22fe3e83041ff1c194fdbc"

RPROVIDES:${PN} += "libsynctex.so.2 \
libsynctex2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
