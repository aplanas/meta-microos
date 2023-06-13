SUMMARY = "Offline English thesaurus based on WordNet"
DESCRIPTION = "Artha is a free cross-platform English thesaurus that works \
completely off-line and is based on WordNet."
LICENSE = "GPL-2.0-only"

PV = "1.0.5"

RPM_NAME = "artha-1.0.5-1.13.aarch64.rpm"
RPM_HASH = "a3711f0a63bd3ed92751788f2f10155b1712e30f766205135543f5d3685b130445f5d9f27f59c0b94956e774ee86aa84d69d064e678001442b58286137edc057"

RPROVIDES:${PN} += "application() \
application(artha.desktop) \
artha \
artha(aarch-64)"

RDEPENDS:${PN} += "enchant \
hunspell \
ld-linux-aarch64.so.1()(64bit) \
libWN.so.3()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libdbus-glib-1.so.2()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
wordnet"

inherit rpm
