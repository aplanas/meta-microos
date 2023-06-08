SUMMARY = "New Air skin for Fcitx"
DESCRIPTION = "New Air skin for Fcitx, inspired by KDE Air theme. \
 \
You can either use this package or download from kde-look.org using knewstaff in \
fcitx-config-kde4."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-skin-new-air-4.2.9.9-1.5.noarch.rpm"
RPM_HASH = "f58876152650a72bef13af0254f1fac0c3abe7987651c9987181d14bcc93a9b6fab204ad97be16f6766e99f9371bdddd9894b3c21067c8c9c9bb5ec4ace4b514"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-skin-new-air"
RDEPENDS:${PN} += "fcitx"

inherit rpm
