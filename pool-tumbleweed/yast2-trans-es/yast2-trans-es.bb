SUMMARY = "YaST2 - Spanish Translations"
DESCRIPTION = "YaST2 - Spanish Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-es-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "0efbda5158124c489b7783f4efa227b2170607b3da1f4f1a70f799acd0b9c432245156a59a7520900a762d930a96ba7238db20584f5ed7834601b78afe48e5b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-es \
yast2-trans-es"

RDEPENDS:${PN} += ""

inherit rpm
