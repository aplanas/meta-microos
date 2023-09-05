SUMMARY = "openSUSE default Skins for Fcitx"
DESCRIPTION = "openSUSE default skins for Fcitx \
 \
You can either use this package or download from kde-look.org using knewstaff in fcitx-config-kde4."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-branding-openSUSE-4.2.9.9-2.1.noarch.rpm"
RPM_HASH = "e372f955eac055d828600d0a90db6f8ed12a6207c6c3b629650ae7c7407dfb7c4dd9319bf1c330c614d6e5ff23753d00f31a19f7033b55bd8d0ca47ad1d269b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-branding \
fcitx-branding-openSUSE"

RDEPENDS:${PN} += "fcitx"

inherit rpm
