SUMMARY = "Noto Kharoshthi Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Kharoshthi Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-kharoshthi-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "6646569cdb506944cca30abdb754b6101542711fb358ee2b1383ce2dc429fea62a2b3a2c7777a5f8ce4afe229543eabb220696af1281813a01ad99ad949c96ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-kharoshthi \
noto-sans-kharoshthi-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
