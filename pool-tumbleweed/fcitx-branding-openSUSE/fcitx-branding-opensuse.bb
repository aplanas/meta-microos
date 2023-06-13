SUMMARY = "openSUSE default Skins for Fcitx"
DESCRIPTION = "openSUSE default skins for Fcitx \
 \
You can either use this package or download from kde-look.org using knewstaff in fcitx-config-kde4."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-branding-openSUSE-4.2.9.9-1.5.noarch.rpm"
RPM_HASH = "75eafb5ebe16ec63a5811e1fe96f416aead08ed49ef364b83b7a926791ede86beade696edc003cc3674df461192cf98e4403112fad644634dd68ca7e46bb631c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fcitx-branding \
fcitx-branding-openSUSE"

RDEPENDS:${PN} += "fcitx"

inherit rpm
