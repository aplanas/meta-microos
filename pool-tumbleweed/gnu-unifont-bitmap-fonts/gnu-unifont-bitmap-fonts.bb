SUMMARY = "GNU Unifont (X11 portable compiled format)"
DESCRIPTION = "The GNU Unifont by Roman Czyborra. \
Glyphs above the Unicode Basic Multilingual Plane. \
Unicode ConScript Unicode Registry (CSUR) PUA Glyphs. \
 \
This package contains the font in .pcf format."
LICENSE = "GPL-2.0-or-later | OFL-1.1"

PV = "15.0.01"

RPM_NAME = "gnu-unifont-bitmap-fonts-15.0.01-2.1.noarch.rpm"
RPM_HASH = "79abe0fa4d9e9fb6376e48212f3e252667f7b156aed4d2b8a686d59b271b23afb802bfc3d60c4dc50da9ae538f38c437900b6a90c09b3810db922e3c31dcb195"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnu-unifont-bitmap-fonts"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
