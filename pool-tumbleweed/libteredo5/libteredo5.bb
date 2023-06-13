SUMMARY = "Teredo implementation library used by miredo"
DESCRIPTION = "Miredo is an implementation of the 'Teredo: Tunneling IPv6 over UDP \
through NATs' proposed Internet standard (RFC4380). \
This package contains a Teredo implementation."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.6"

RPM_NAME = "libteredo5-1.2.6-5.7.aarch64.rpm"
RPM_HASH = "4d7c76bcc19e0fb98c2f563a44f774d0eb7aec603ae4a3d062489006ca71f913509360ab74d6803c28bdd1bec3b330caa510de2f6c2a4fca17edea2972d6e85c"

RPROVIDES:${PN} += "libteredo.so.5()(64bit) \
libteredo5 \
libteredo5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libJudy.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
