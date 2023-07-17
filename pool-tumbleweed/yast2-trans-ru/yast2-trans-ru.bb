SUMMARY = "YaST2 - Russian Translations"
DESCRIPTION = "YaST2 - Translations for Russian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-ru-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "0091977796d194c6e3b297a4d567f18805f881aa1671c4e5d62144d8e5b411fc8917a4f0e135d46ce722072bcba6ea9a7d1e7210267d7eb6b797fdedc1807799"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ru \
yast2-trans-ru"

RDEPENDS:${PN} += ""

inherit rpm
