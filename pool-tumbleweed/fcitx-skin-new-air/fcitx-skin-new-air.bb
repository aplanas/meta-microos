SUMMARY = "New Air skin for Fcitx"
DESCRIPTION = "New Air skin for Fcitx, inspired by KDE Air theme. \
 \
You can either use this package or download from kde-look.org using knewstaff in \
fcitx-config-kde4."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-skin-new-air-4.2.9.9-1.6.noarch.rpm"
RPM_HASH = "f242c8a2ce4df1b6a2410c3737b5d02ccee0708bb10885cc20ff52780a4fc6f5742d7292f03f321484272648552d749f2001be7b27cd6f2cc01e7a5d8027fb44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-skin-new-air"

RDEPENDS:${PN} += "fcitx"

inherit rpm
