SUMMARY = "A simple thesaurus for Libreoffice"
DESCRIPTION = "Hyphen is a library for high quality hyphenation and justification."
LICENSE = "GPL-2.0+ | LGPL-2.0+ | MPL-1.1+"

PV = "2.8.8"

RPM_NAME = "libhyphen0-2.8.8-2.27.aarch64.rpm"
RPM_HASH = "7b3742717890accd9e68f62dacb1516fde8c995d40c0619a80807efab47ff5e223c929ee6b2e770cbecdca21d418d3814dceb9c469fedea0ddad1f2a514a203c"

RPROVIDES:${PN} += "libhyphen.so.0 \
libhyphen0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
