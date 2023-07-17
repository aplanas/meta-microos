SUMMARY = "YaST2 - Polish Translations"
DESCRIPTION = "YaST2 - Translations for Polish."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-pl-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "b7c8c8a5ca7f9bafaec847a43ba9bc3e7ecc6f773460d96e108843dfd2861228be52022acde481141d4346d5bfa78c54831b0b1169396ec62aa64ebb2e62d150"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-pl \
yast2-trans-pl"

RDEPENDS:${PN} += ""

inherit rpm
