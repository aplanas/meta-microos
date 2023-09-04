SUMMARY = "YaST2 - Bosnian Translations"
DESCRIPTION = "YaST2 - Translations for Bosnian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-bs-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "140bb812eebf91e3bcb75594fefdaf6440f14b00f9dc22a2f63b834d0494b88b1ecf2339a9c89e3298ba129f6180ab7cb441fe14e27dfec1b043595ce5a1bdce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-bs \
yast2-trans-bs"

RDEPENDS:${PN} += ""

inherit rpm
