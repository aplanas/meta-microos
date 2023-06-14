SUMMARY = "YaST2 - Ukrainian Translations"
DESCRIPTION = "YaST2 - Translations for Ukrainian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-uk-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "38b64f10e226b82158e23969b811e68164b3646209c5243345d7e4b573979661f010a92633fa1fb411e72319711791aba1bcf4793918439aaf2f5f7d79082d9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-uk \
yast2-trans-uk"

RDEPENDS:${PN} += ""

inherit rpm
