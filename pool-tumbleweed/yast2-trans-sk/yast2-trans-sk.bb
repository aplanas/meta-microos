SUMMARY = "YaST2 - Slovak Translations"
DESCRIPTION = "YaST2 - Slovak Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-sk-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "958f854937c9cd345339f50b4b201083aa31c6b6c507e02f897dc017c79456597e4622c1e1e3e9d8d9f952d136850902f2a7e608e0d8cada7a921d56e5dcf106"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sk \
yast2-trans-sk"

RDEPENDS:${PN} += ""

inherit rpm
