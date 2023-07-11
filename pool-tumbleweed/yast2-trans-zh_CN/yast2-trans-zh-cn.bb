SUMMARY = "YaST2 - Simplified Chinese Translations"
DESCRIPTION = "YaST2 - Simplified Chinese translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230630.ccfa6add46"

RPM_NAME = "yast2-trans-zh_CN-84.87.20230630.ccfa6add46-1.1.noarch.rpm"
RPM_HASH = "5aa3cc3377e57d44eb82b73b145656a54c79c5fd50e26525723a5cfa09d5ee0515cf2737fc311633ec5918976901053f89e0355c8b494a1c1089540b52ada0d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-zh-CN \
yast2-trans-zh-CN"

RDEPENDS:${PN} += ""

inherit rpm
