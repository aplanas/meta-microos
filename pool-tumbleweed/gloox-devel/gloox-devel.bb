SUMMARY = "High-level XMPP Library for C++"
DESCRIPTION = "gloox is a portable high-level Jabber/XMPP library for C++. It is fully \
compliant with the XMPP RFCs, supports all of the XMPP features (including \
SRV lookups, TLS, SASL, roster management, and privacy lists), and implements \
several XEPs that make it ideal for writing any kind of Jabber/XMPP client \
or component."
LICENSE = "GPL-3.0-only"

PV = "1.0.24"

RPM_NAME = "gloox-devel-1.0.24-2.5.aarch64.rpm"
RPM_HASH = "1060920e482b2dd9cda719f2e00870d33c2d6805ff66852a54c008a1740ae9364f1cf42a7a61e018ddab9d817adee5ea09693a7afa48e4b173dfffe0c25ac880"

RPROVIDES:${PN} += "gloox-devel \
gloox-devel(aarch-64) \
pkgconfig(gloox)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
libgloox18 \
libstdc++-devel"

inherit rpm
