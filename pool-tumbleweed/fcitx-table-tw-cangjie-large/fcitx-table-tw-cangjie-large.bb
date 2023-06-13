SUMMARY = "Tsang Jei large character set table for Fcitx"
DESCRIPTION = "Fcitx Tsang Jei (Cang Jie) table with large character set \
for Traditional Chinese."
LICENSE = "SUSE-Public-Domain"

PV = "0.3.8"

RPM_NAME = "fcitx-table-tw-cangjie-large-0.3.8-2.5.noarch.rpm"
RPM_HASH = "1a7b0751205570c83ad8d3bb7706c90114d133b4dd6a8dc6ef5125fe3436d0206667dbde0344a7a95e1d02c52d216243bcf9e63d70b32c45f7be29b0fa2bb643"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-extra \
fcitx-table-tw-cangjie-large \
locale(fcitx-table:zh_TW;)"

RDEPENDS:${PN} += "fcitx-table"

inherit rpm
