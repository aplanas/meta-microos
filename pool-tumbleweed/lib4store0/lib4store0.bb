SUMMARY = "4store RDF Storage Library"
DESCRIPTION = "This package provides 4store RDF storage shared library."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.6"

RPM_NAME = "lib4store0-1.1.6-3.14.aarch64.rpm"
RPM_HASH = "e1ee9c8dac89ca7782c97714b1a1831dae9dcb5a862ae533f1accce7516a0995cc3f6b919a4615c9de7a5b91a4a949f5893c885fae72458efa9b50429ac40d83"

RPROVIDES:${PN} += "lib4store.so.0()(64bit) \
lib4store0 \
lib4store0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libavahi-client.so.3()(64bit) \
libavahi-common.so.3()(64bit) \
libavahi-glib.so.1()(64bit) \
libc.so.6()(64bit) \
libglib-2.0.so.0()(64bit)"

inherit rpm
