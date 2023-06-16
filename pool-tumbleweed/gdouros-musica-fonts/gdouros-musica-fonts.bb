SUMMARY = "Font with Support for Unicode Musical Notation Symbols"
DESCRIPTION = "Musica covers the following scripts and symbols supported by The Unicode \
Standard: Basic Latin, Greek and Coptic, some Punctuation and other Symbols, \
Byzantine Musical Symbols, (Western) Musical Symbols and Archaic Greek \
Musical Notation."
LICENSE = "SUSE-Permissive"

PV = "3.17"

RPM_NAME = "gdouros-musica-fonts-3.17-1.15.noarch.rpm"
RPM_HASH = "c9a47dcd33c2542012471b748504805eeb7b7e7cc90904d36e5db13140a062f3b0b08b03bcb1261868305ab846901eed96c786de95f1038bedbd84046cca371f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gdouros-musica-fonts \
musica-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
