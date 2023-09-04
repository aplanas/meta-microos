SUMMARY = "A XMPP library for C"
DESCRIPTION = "The libstrophe library is a XMPP library written in C."
LICENSE = "GPL-3.0-or-later | MIT"

PV = "0.12.3"

RPM_NAME = "libstrophe0-0.12.3-1.1.aarch64.rpm"
RPM_HASH = "d4473bd67983b184b8b4f1b2e10933abf965015de12b5bb746a367f74a27ff4e6f9ce2a44097a34c9c3a42cc6c8dec45b75d8cda9396efe8ccd74a1e54b9e0e8"

RPROVIDES:${PN} += "libstrophe.so.0 \
libstrophe0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
libxml2.so.2"

inherit rpm
