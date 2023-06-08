SUMMARY = "Smart Tsang Jei 6 table for Fcitx"
DESCRIPTION = "Fcitx Smart Tsang Jei (Fast Cang Jie) 6 table for Traditional Chinese."
LICENSE = "SUSE-Public-Domain"

PV = "0.3.8"

RPM_NAME = "fcitx-table-tw-smart-cangjie6-0.3.8-2.5.noarch.rpm"
RPM_HASH = "5b1bfc04f84acc6efdabb442aa2cde095315ecd85a9808b73d5a8f98f24bf68ce5cd4cb77f5804849e1a7b1a5b1f8cf93503a824a16c6bc18f0c8c24b030ba76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-extra fcitx-table-tw-smart-cangjie6 locale(fcitx-table:zh_TW;)"
RDEPENDS:${PN} += "fcitx-table"

inherit rpm
