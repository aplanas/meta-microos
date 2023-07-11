SUMMARY = "High-level XMPP Library for C++"
DESCRIPTION = "gloox is a portable high-level Jabber/XMPP library for C++. It is fully \
compliant with the XMPP RFCs, supports all of the XMPP features (including \
SRV lookups, TLS, SASL, roster management, and privacy lists), and implements \
several XEPs that make it ideal for writing any kind of Jabber/XMPP client \
or component."
LICENSE = "GPL-3.0-only"

PV = "1.0.24"

RPM_NAME = "libgloox18-1.0.24-2.6.aarch64.rpm"
RPM_HASH = "829f03d8df81b951c017335fc14f9ab963319a9c1f2dbb19953e7d8700adda473171219da4cdfcdce94201a38a7138af8066c6e78191380c5ca35cd36969b7cc"

RPROVIDES:${PN} += "libgloox.so.18 \
libgloox18"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgnutls.so.30 \
libidn.so.12 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
