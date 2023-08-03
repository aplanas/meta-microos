SUMMARY = "YaST2 - Kurdish Translations"
DESCRIPTION = "YaST2 - Kurdish Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-ku-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "64cce62fc10cbda2d40dc5201913812f1cd493474f387f276d84e14316a5d55eeb9661922760e2bf32735a3a461a6503aea8f1ff997215279a109ee719b30bf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ku \
yast2-trans-ku"

RDEPENDS:${PN} += ""

inherit rpm
