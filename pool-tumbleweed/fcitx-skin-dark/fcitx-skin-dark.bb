SUMMARY = "Fcitx Dark Skin"
DESCRIPTION = "Fcitx dark skin. \
 \
You can either use this package for download from kde-look.org using knewstaff in fcitx-config-kde4."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-skin-dark-4.2.9.9-2.1.noarch.rpm"
RPM_HASH = "727746b157d17a7d2bdd1c33b45fe845335d246ba9abe391a6cf001d370f075dd32004fe5762c71b20f941b38097c07ac0706b056bf549934a69eb3cb9b818fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-skin-dark"

RDEPENDS:${PN} += "fcitx"

inherit rpm
