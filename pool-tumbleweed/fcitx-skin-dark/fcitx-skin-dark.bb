SUMMARY = "Fcitx Dark Skin"
DESCRIPTION = "Fcitx dark skin. \
 \
You can either use this package for download from kde-look.org using knewstaff in fcitx-config-kde4."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-skin-dark-4.2.9.9-1.5.noarch.rpm"
RPM_HASH = "043b524ae33ce964b211ceecb0247c8f7916a26683fde85c48037842eff8b87370893cb01662050187b396d2088e1a26546e64dd92949c4323456ab14dc2c6e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-skin-dark"

RDEPENDS:${PN} += "fcitx"

inherit rpm
