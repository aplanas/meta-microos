SUMMARY = "YaST2 - Serbian Translations"
DESCRIPTION = "YaST2 - Translations for Serbian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-sr-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "6e2f2f7560f72deeb0f5e3882854b9392df7711917eb043f6cace011c27caa951fd9473532a2f88f0f9a866e1a02f0319cf9eca1da4be22cc94ca5c90e6d5a3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sr \
yast2-trans-sr"

RDEPENDS:${PN} += ""

inherit rpm
