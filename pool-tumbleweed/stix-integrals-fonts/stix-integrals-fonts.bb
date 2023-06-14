SUMMARY = "STIX scientific and engineering fonts, additional integral glyphs"
DESCRIPTION = "This package includes fonts containing additional integrals of various size \
and slant."
LICENSE = "OFL-1.1"

PV = "1.1.0"

RPM_NAME = "stix-integrals-fonts-1.1.0-12.18.noarch.rpm"
RPM_HASH = "cda967a940cb074ebafe9b151fdc6c871e5a2bbc43104e0ac1829e62b4b9928edf9a159edf2e2d136ecc009378524ef30ca03c204535ec84eff0527f5b5dd30c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-stix-integrals-fonts \
font-stixintegralsd \
font-stixintegralssm \
font-stixintegralsup \
font-stixintegralsupd \
font-stixintegralsupsm \
stix-integrals-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl \
stix-fonts"

inherit rpm
