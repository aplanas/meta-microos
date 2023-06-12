SUMMARY = "Command Line Interface Tool for XMPP"
DESCRIPTION = "xmppc is a XMPP command line interface client."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.2"

RPM_NAME = "xmppc-0.1.2-1.4.aarch64.rpm"
RPM_HASH = "2c921c3cafe02f5f04eea4ad8333dd7b5ab5aaa370a2d800bd6ae5f721898692cfb1420756195defefd5092451876067591765d35307e95dd04cd88e9073cf06"

RPROVIDES:${PN} += "xmppc \
xmppc(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit) \
libgpgme.so.11()(64bit) \
libgpgme.so.11(GPGME_1.0)(64bit) \
libgpgme.so.11(GPGME_1.1)(64bit) \
libstrophe.so.0()(64bit)"

inherit rpm
