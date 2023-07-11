SUMMARY = "High-level XMPP Library for C++"
DESCRIPTION = "gloox is a portable high-level Jabber/XMPP library for C++. It is fully \
compliant with the XMPP RFCs, supports all of the XMPP features (including \
SRV lookups, TLS, SASL, roster management, and privacy lists), and implements \
several XEPs that make it ideal for writing any kind of Jabber/XMPP client \
or component."
LICENSE = "GPL-3.0-only"

PV = "1.0.24"

RPM_NAME = "gloox-devel-1.0.24-2.6.aarch64.rpm"
RPM_HASH = "8f95ed18f1c0d17f8fccaf475f4b26ef55e3d2b7c321e12c77785e67bb246c874c4f0a3a651092f25c22b66c1dddbf400b03667e5e49c5ecdc20cb2cc32bc6ca"

RPROVIDES:${PN} += "gloox-devel \
pkgconfig-gloox"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libgloox18 \
libstdc++-devel"

inherit rpm
