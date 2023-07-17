SUMMARY = "YaST2 - Greek Translations"
DESCRIPTION = "YaST2 - Translations for Greek."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-el-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "6923a9748be0a315c84fb6be72033c79a43fd1cb0b278ea2c57d0dabb19aa127889b168066cf4763536e07c9f75eeff5d1310b765fb2a311785d9ca1f990f5da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-el \
yast2-trans-el"

RDEPENDS:${PN} += ""

inherit rpm
