SUMMARY = "Fcitx Classic Skin"
DESCRIPTION = "Fcitx classic skin. \
 \
You can either use this package or download from kde-look.org using knewstaff in fcitx-config-kde4."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-skin-classic-4.2.9.9-1.5.noarch.rpm"
RPM_HASH = "8f675144c707075a7f401fed879360343626bb3914883a6a2deef53fad3702648334360a4568c44762ff2167ad85638a909c1d1507832900a91f51f6a3918d4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-skin-classic"

RDEPENDS:${PN} += "fcitx"

inherit rpm
