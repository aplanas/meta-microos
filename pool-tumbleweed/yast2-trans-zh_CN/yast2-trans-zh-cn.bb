SUMMARY = "YaST2 - Simplified Chinese Translations"
DESCRIPTION = "YaST2 - Simplified Chinese translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-zh_CN-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "c182ac865f10d7668da00e0ebaf23a098ae4c83abb6b80ab7b6e483f24b4fa033f5704f93071108f11f5d9d40df5505047e168881c2ac90b4db7febdb9915676"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:zh_CN) \
yast2-trans-zh_CN"
RDEPENDS:${PN} += ""

inherit rpm
