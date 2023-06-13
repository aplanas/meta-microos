SUMMARY = "Development Files for libskk"
DESCRIPTION = "SKK is a statistical language model based Japanese input method engine. \
to model the Japanese language, it use a backoff bigram and trigram \
 \
This package provides C/Vala headers for the libskk library."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.0+git20171110+1.0.3"

RPM_NAME = "libskk-devel-1.2.0+git20171110+1.0.3-2.8.aarch64.rpm"
RPM_HASH = "d1cd6c369bdf97554fdf2896734312dad4e780ae61b372ada35b26f4f033b2ba384d2674de63a66059b117fd0839c20916cbb81167d7aadbaf3a752d99c790be"

RPROVIDES:${PN} += "libskk-devel \
libskk-devel(aarch-64) \
pkgconfig(libskk)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libskk0 \
pkgconfig(gee-0.8) \
pkgconfig(gio-2.0) \
pkgconfig(gobject-2.0)"

inherit rpm
