SUMMARY = "A tool to test PAM applications and PAM modules"
DESCRIPTION = "If you plan to test a PAM module, you can use this library, which simplifies \
testing of modules."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.4"

RPM_NAME = "libpamtest0-1.1.4-2.4.aarch64.rpm"
RPM_HASH = "e05bd659ba0e950a94674d8d3ea440de89ff0db5c19f7639039f0dd006e6072685b4c34c0f17c68199087261f72910b657f015dc10c94e721343a0d289109b72"

RPROVIDES:${PN} += "libpamtest.so.0 \
libpamtest0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpam.so.0 \
pam-wrapper"

inherit rpm
