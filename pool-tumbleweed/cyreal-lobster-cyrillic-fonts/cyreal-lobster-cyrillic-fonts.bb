SUMMARY = "Lobster Cyrillic Font"
DESCRIPTION = "A lovely Bold Condensed Script fully loaded with hundreds of ligatures \
and alternates. \
 \
Lobster Cyrillic includes: \
- 99 Cyrillic ligatures. \
- 25 ending glyphs. \
- 100 ending ligatures. \
- 2 initial ligatures. \
- Ukrainian Hryvnia and Russian Ruble currency symbols."
LICENSE = "OFL-1.1"

PV = "1.4"

RPM_NAME = "cyreal-lobster-cyrillic-fonts-1.4-7.17.noarch.rpm"
RPM_HASH = "95db5910724a262d0d026785c799d23a4b636f8ac83a475d32ab8a60f86ed218e50d5e4b8955e51ed5b7cee9d7145e8e380eed5d8f28ad20e6223f593caf004f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cyreal-lobster-cyrillic-fonts \
lobster-cyrillic-fonts \
locale-ru;uk"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
