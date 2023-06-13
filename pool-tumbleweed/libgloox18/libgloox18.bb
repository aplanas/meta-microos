SUMMARY = "High-level XMPP Library for C++"
DESCRIPTION = "gloox is a portable high-level Jabber/XMPP library for C++. It is fully \
compliant with the XMPP RFCs, supports all of the XMPP features (including \
SRV lookups, TLS, SASL, roster management, and privacy lists), and implements \
several XEPs that make it ideal for writing any kind of Jabber/XMPP client \
or component."
LICENSE = "GPL-3.0-only"

PV = "1.0.24"

RPM_NAME = "libgloox18-1.0.24-2.5.aarch64.rpm"
RPM_HASH = "a732d297599e845527bdccf391b6c6c850c2f410f54500ec1d7723a6ef0d0b3c1c5d0fa06406109a341936bcecb95046797e9c2a2f3087a028108c460b456302"

RPROVIDES:${PN} += "libgloox.so.18()(64bit) \
libgloox18 \
libgloox18(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libidn.so.12()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
