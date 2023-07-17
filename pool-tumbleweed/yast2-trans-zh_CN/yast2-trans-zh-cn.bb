SUMMARY = "YaST2 - Simplified Chinese Translations"
DESCRIPTION = "YaST2 - Simplified Chinese translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230708.d1de37aed1"

RPM_NAME = "yast2-trans-zh_CN-84.87.20230708.d1de37aed1-1.1.noarch.rpm"
RPM_HASH = "1b6a45c2a0fda4c9c5b6b9ef7d4d91cbb765569e9db55a21105ebdd26fac59069f88822ca79eb2aedc3b4fea0b5575549acbd9a3cd579074e61c496f462468de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-zh-CN \
yast2-trans-zh-CN"

RDEPENDS:${PN} += ""

inherit rpm
