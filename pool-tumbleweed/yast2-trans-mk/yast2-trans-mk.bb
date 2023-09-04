SUMMARY = "YaST2 - Macedonian Translations"
DESCRIPTION = "YaST2 - Translations for Macedonian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-mk-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "2128ded00ff9a1846caea2ada95710be4e91ad4b192476b44aade8ae3352bdf3fae80a21d8ae01c930ffff229887fdc16ca26713305181baec8d0a5656a3220d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-mk \
yast2-trans-mk"

RDEPENDS:${PN} += ""

inherit rpm
