SUMMARY = "YaST2 - Hungarian Translations"
DESCRIPTION = "YaST2 - Hungarian translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-hu-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "e074a223f77c1871485c06b02c596ac6e0fc597aba065cd8985294759f3c41612bd69176d14543f42df2c8ccf57069218feb39332897f3996fd49dfa2a89334b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:hu) \
yast2-trans-hu"

RDEPENDS:${PN} += ""

inherit rpm
