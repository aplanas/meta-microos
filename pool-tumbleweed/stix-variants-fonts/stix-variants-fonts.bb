SUMMARY = "STIX scientific and engineering fonts, additional glyph variants"
DESCRIPTION = "This package includes fonts containing alternative variants of some glyphs."
LICENSE = "OFL-1.1"

PV = "1.1.0"

RPM_NAME = "stix-variants-fonts-1.1.0-12.18.noarch.rpm"
RPM_HASH = "44c55b1c5b7b1d12c52b76bee897539391bd1fee87b042be1a1775d5ba88f380af61989c493108cbba01a6c902913fd926c3f5cdb9fd760493d2129e9ab032c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(stix-variants-fonts) \
font(stixvariants) \
stix-variants-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl \
stix-fonts"

inherit rpm
