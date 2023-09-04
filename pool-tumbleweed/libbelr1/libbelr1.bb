SUMMARY = "Language recognition library"
DESCRIPTION = "Belr parses input formatted according to a language defined by an \
ABNF grammar, such as the protocols standardised at IETF."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.98"

RPM_NAME = "libbelr1-5.2.98-1.1.aarch64.rpm"
RPM_HASH = "f8a00fe3e6234bdb19f1638809d9755557cd0f5f7aff6f31fa26499fd541ee9da74167cd307703f9becf9634cfec3cafcf0165a13c7de4faa32efdeabc44827a"

RPROVIDES:${PN} += "libbelr.so.1 \
libbelr1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbctoolbox.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
