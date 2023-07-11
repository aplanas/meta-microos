SUMMARY = "Language recognition library"
DESCRIPTION = "Belr parses input formatted according to a language defined by an \
ABNF grammar, such as the protocols standardised at IETF."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.51"

RPM_NAME = "libbelr1-5.2.51-1.2.aarch64.rpm"
RPM_HASH = "19908b68fbd0396bd115245ee03ad29a65c81b2665ed581f02da6ad385066dd7f8f9141bbc852188c2dcb00c72ed3b2936509926a6adf99cac6ae68956a38d87"

RPROVIDES:${PN} += "libbelr.so.1 \
libbelr1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbctoolbox.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
