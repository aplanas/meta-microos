SUMMARY = "Tsang Jei 5 table for Fcitx"
DESCRIPTION = "Fcitx Tsang Jei (Cang Jie) 5 table for Traditional Chinese."
LICENSE = "SUSE-Public-Domain"

PV = "0.3.8"

RPM_NAME = "fcitx-table-tw-cangjie5-0.3.8-2.5.noarch.rpm"
RPM_HASH = "78eb987874a917709d88c0d1c373d52b69e1e9425e09affca38b60bdaa58b8daa6ba8917b17cb0f789d2a98a0e96994d1a48f62e9e300c65f0a0963ea2f65624"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-table-extra \
fcitx-table-tw-cangjie5 \
locale(fcitx-table:zh_TW;)"

RDEPENDS:${PN} += "fcitx-table"

inherit rpm
