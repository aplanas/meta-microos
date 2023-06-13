SUMMARY = "SIP connection manager for Telepathy"
DESCRIPTION = "IETF SIP connection manager for Telepathy using the SofiaSIP protocol \
stack; formerly known as telepathy-sofiasip"
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.0"

RPM_NAME = "telepathy-rakia-0.8.0-5.12.aarch64.rpm"
RPM_HASH = "63ecc0e1f2cbf771801f6b6686285037190068302c5828147bb1fcd8aa8e75665a08c9cabfda4f7014f6894577c3faf53efe93a1ff663984d3d03de9fe0b5c4c"

RPROVIDES:${PN} += "telepathy-rakia \
telepathy-rakia(aarch-64) \
telepathy-sofiasip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libdbus-glib-1.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libsofia-sip-ua-glib.so.3()(64bit) \
libsofia-sip-ua.so.0()(64bit) \
libtelepathy-glib.so.0()(64bit)"

inherit rpm
