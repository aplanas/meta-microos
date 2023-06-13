SUMMARY = "GNU Unifont (OpenType Format)"
DESCRIPTION = "The GNU Unifont by Roman Czyborra. \
Glyphs above the Unicode Basic Multilingual Plane. \
Unicode ConScript Unicode Registry (CSUR) PUA Glyphs. \
 \
This package contains fonts in OpenType format."
LICENSE = "GPL-2.0-or-later | OFL-1.1"

PV = "15.0.01"

RPM_NAME = "gnu-unifont-otf-fonts-15.0.01-2.1.noarch.rpm"
RPM_HASH = "c21ae06685345494c4de71540cbebe4e5e2ba521ede5b8d4eb9fad974db602254c4de1b4ecf6e554ad9616fa3737cba7a976a5d9b14a04eac312125081b571cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnu-unifont-otf-fonts"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
