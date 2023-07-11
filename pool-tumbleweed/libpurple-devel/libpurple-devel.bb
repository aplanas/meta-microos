SUMMARY = "Development Headers, Documentation, and Libraries for libpurple"
DESCRIPTION = "The libpurple-devel package contains the header files, developer \
documentation, and libraries required for development of libpurple \
based instant messaging clients or plugins for any libpurple based \
client."
LICENSE = "GPL-2.0-only"

PV = "2.14.12"

RPM_NAME = "libpurple-devel-2.14.12-1.4.aarch64.rpm"
RPM_HASH = "c519c4e48b081ab58e23963ff1ebfb862712d67378efdc5f22828bfff4594663ada954edac57c775e17153e280bd4b7fb156b0f9ed9e1fc0e0b306aec1457441"

RPROVIDES:${PN} += "libpurple-devel \
pkgconfig-purple"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpurple \
pkgconfig-glib-2.0 \
pkgconfig-libxml-2.0"

inherit rpm
