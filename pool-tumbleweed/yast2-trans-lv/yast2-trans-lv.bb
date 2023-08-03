SUMMARY = "YaST2 - Latvian Translations"
DESCRIPTION = "YaST2 - Translations for Latvian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-lv-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "bfe9337c2d4ac3ff66aa233b5aa7fd7ef2f1dacc54ea98f94c0b0f7887f9ff9e46fa480e2ae59315b335e099c02c86f11ca7c3c4a788a239bf70faa70ff58d65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-lv \
yast2-trans-lv"

RDEPENDS:${PN} += ""

inherit rpm
