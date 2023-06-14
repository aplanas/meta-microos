SUMMARY = "YaST2 - Traditional Chinese Translations"
DESCRIPTION = "YaST2 - Translations for Traditional Chinese."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-zh_TW-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "873056a61e3a0598a3135dc8170c3e9693cf49b3d5f8e03eb906f837170b620dcaad7ffe965f94f0e7a02cdc6dfcb58841677007eaeb05786f35f29a506fa844"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-zh-TW \
yast2-trans-zh-TW"

RDEPENDS:${PN} += ""

inherit rpm
