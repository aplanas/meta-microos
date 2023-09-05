SUMMARY = "New Air skin for Fcitx"
DESCRIPTION = "New Air skin for Fcitx, inspired by KDE Air theme. \
 \
You can either use this package or download from kde-look.org using knewstaff in \
fcitx-config-kde4."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-skin-new-air-4.2.9.9-2.1.noarch.rpm"
RPM_HASH = "d0369ab8040f3837321b60a6f4dc4690861d6213e8e56ca698fbcdba326a1a3496f7ddbd8dce933189066a597b9b0032f99f8d7097bc357ebece88ccf3a09a2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-skin-new-air"

RDEPENDS:${PN} += "fcitx"

inherit rpm
