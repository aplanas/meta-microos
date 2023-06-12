SUMMARY = "Wubi large character set table for Fcitx"
DESCRIPTION = "Fcitx Wubi (Wu Bi Zi Xing) table with large character set \
for Simplified Chinese. \
 \
Wubi in Fcitx is based on wubi x86."
LICENSE = "SUSE-Public-Domain"

PV = "0.3.8"

RPM_NAME = "fcitx-table-cn-wubi-large-0.3.8-2.5.noarch.rpm"
RPM_HASH = "6b82c2f06d23098b9b209efa5709f6726e5eb7f044c874c1e3f3f31d07c95cc8247cbc963382a2f67a07aa191befe3404f6f7f6c29407945d7ca166e6a593110"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-cn-wubi-large \
fcitx-table-extra \
locale(fcitx-table:zh_CN;)"
RDEPENDS:${PN} += "fcitx-table"

inherit rpm
