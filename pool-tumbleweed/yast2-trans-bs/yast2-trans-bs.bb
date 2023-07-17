SUMMARY = "YaST2 - Bosnian Translations"
DESCRIPTION = "YaST2 - Translations for Bosnian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-bs-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "ecaf0c7fdd67e3b545c1f0ab282a1a37922f50ebc1ec20195dd9fd36fed55eb5b3b7fb39f106a8aa16157cfe033833a50da148cf0cf9d2bc7a109a10201a7a67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-bs \
yast2-trans-bs"

RDEPENDS:${PN} += ""

inherit rpm
