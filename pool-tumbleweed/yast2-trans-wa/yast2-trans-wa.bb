SUMMARY = "YaST2 - Walloon Translations"
DESCRIPTION = "YaST2 - Translations for Walloon."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-wa-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "af5bf8fb24a3ecb2e5e4edf33387c520e15c5d32767a77c963b4af762c4a541515bd831d1febf89822593fcc8e41098dd91f14802b6d6091a2ba40ff04884b86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-wa \
yast2-trans-wa"

RDEPENDS:${PN} += ""

inherit rpm
