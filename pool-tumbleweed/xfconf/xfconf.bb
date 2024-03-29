SUMMARY = "Simple Configuration Storage for Xfce"
DESCRIPTION = "Xfconf is a simple client-server configuration storage and query system for the \
Xfce desktop."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.1"

RPM_NAME = "xfconf-4.18.1-1.1.aarch64.rpm"
RPM_HASH = "09cfad1a8a8bb991779f894c6be00958aa51b008714acd06d5dcbde0258fc1689a8d301d9c62e2dcc982ccea49497c2bbf86a87c360039da0268dc11591df25d"

RPROVIDES:${PN} += "xfconf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3"

inherit rpm
