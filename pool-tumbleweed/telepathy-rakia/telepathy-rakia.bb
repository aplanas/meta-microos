SUMMARY = "SIP connection manager for Telepathy"
DESCRIPTION = "IETF SIP connection manager for Telepathy using the SofiaSIP protocol \
stack; formerly known as telepathy-sofiasip"
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.0"

RPM_NAME = "telepathy-rakia-0.8.0-5.12.aarch64.rpm"
RPM_HASH = "63ecc0e1f2cbf771801f6b6686285037190068302c5828147bb1fcd8aa8e75665a08c9cabfda4f7014f6894577c3faf53efe93a1ff663984d3d03de9fe0b5c4c"

RPROVIDES:${PN} += "telepathy-rakia \
telepathy-sofiasip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libdbus-glib-1.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsofia-sip-ua-glib.so.3 \
libsofia-sip-ua.so.0 \
libtelepathy-glib.so.0"

inherit rpm
