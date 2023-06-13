SUMMARY = "Unicode Han Database"
DESCRIPTION = "This package contains Unihan.zip which contains the data files for the Unified \
Han database of Hanzi/Kanji/Hanja Chinese characters."
LICENSE = "Unicode-TOU"

PV = "15.0.0"

RPM_NAME = "unicode-ucd-unihan-15.0.0-1.2.noarch.rpm"
RPM_HASH = "3f2ad6354abb6a8a07be2aea49aed788fda900014445876388076bcfde6b571c56fd6d257677be5928550c87ab49fdbda18ae3c3375d6a7109c49967c9ed8281"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "unicode-ucd-unihan"

RDEPENDS:${PN} += "unicode-ucd"

inherit rpm
