SUMMARY = "YaST2 - Kabyle Translations"
DESCRIPTION = "YaST2 - Translations for Kabyle."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-kab-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "21b8e3d69dff3e843ed86215e64be31a79673dab436b0e12a1740aabed3e2261c9ab49f72ccc45ce9223dff8db14a49adcb8dc62f5b955847e411d1760c67f84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-kab \
yast2-trans-kab"

RDEPENDS:${PN} += ""

inherit rpm
