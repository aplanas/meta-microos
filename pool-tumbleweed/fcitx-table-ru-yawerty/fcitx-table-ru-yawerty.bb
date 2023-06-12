SUMMARY = "Russian Yawerty table for Fcitx"
DESCRIPTION = "Fcitx Russian Yawerty table."
LICENSE = "SUSE-Public-Domain"

PV = "0.2.4"

RPM_NAME = "fcitx-table-ru-yawerty-0.2.4-2.5.noarch.rpm"
RPM_HASH = "20f78434975f3c8627678fc0f221760c47aef62f31a261b7e49c49172415723224b2a476038f00989c6ce5896010600aa2cc1042f0080fe2ee16fd8bc65bbe30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-other \
fcitx-table-ru-yawerty"
RDEPENDS:${PN} += "fcitx-table"

inherit rpm
