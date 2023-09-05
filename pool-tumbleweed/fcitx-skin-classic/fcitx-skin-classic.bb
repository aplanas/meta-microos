SUMMARY = "Fcitx Classic Skin"
DESCRIPTION = "Fcitx classic skin. \
 \
You can either use this package or download from kde-look.org using knewstaff in fcitx-config-kde4."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-skin-classic-4.2.9.9-2.1.noarch.rpm"
RPM_HASH = "4f02a22e33827ea1e624f00986ee86a92e874be05a2f322fbabb61be21a54042e175b008937d6925b937bcf21d9c48c891f4110d21aa167b067bbe2005773cf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-skin-classic"

RDEPENDS:${PN} += "fcitx"

inherit rpm
