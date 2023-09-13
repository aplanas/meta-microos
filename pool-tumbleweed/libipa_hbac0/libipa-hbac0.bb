SUMMARY = "FreeIPA HBAC Evaluator library"
DESCRIPTION = "Utility library to validate FreeIPA HBAC rules for authorization \
requests."
LICENSE = "LGPL-3.0-or-later"

PV = "2.9.2"

RPM_NAME = "libipa_hbac0-2.9.2-1.1.aarch64.rpm"
RPM_HASH = "7139f4e0e5a55756dd869a8c646bb4bcceb9f99da9948c6ce0e50e965d431e3c4ab21338985327297d07a2fa448626751a1c6b77ef3cc5999d6959dfb10358de"

RPROVIDES:${PN} += "libipa-hbac.so.0 \
libipa-hbac0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libunistring.so.5"

inherit rpm
