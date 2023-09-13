SUMMARY = "YaST2 - Simplified Chinese Translations"
DESCRIPTION = "YaST2 - Simplified Chinese translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-zh_CN-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "39175e8ecfa9c157a3881c533329350512ff42b70256fb33fab0a30abb005446468505acb325c2cf6980af54d9bfe611d92fa13aa5ffec62085f916196759078"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-zh-CN \
yast2-trans-zh-CN"

RDEPENDS:${PN} += ""

inherit rpm
