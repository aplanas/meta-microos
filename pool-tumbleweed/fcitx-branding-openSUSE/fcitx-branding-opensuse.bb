SUMMARY = "openSUSE default Skins for Fcitx"
DESCRIPTION = "openSUSE default skins for Fcitx \
 \
You can either use this package or download from kde-look.org using knewstaff in fcitx-config-kde4."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-branding-openSUSE-4.2.9.9-1.6.noarch.rpm"
RPM_HASH = "83bab3755624d31eaa373191bdfa70abfd0ab9b8f1d5fc10d15eb244d4774081887065d8d28679988a289c8fc9c36c62c13cf5ac1de3b6d3ce7bd1214eabf2df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-branding \
fcitx-branding-openSUSE"

RDEPENDS:${PN} += "fcitx"

inherit rpm
