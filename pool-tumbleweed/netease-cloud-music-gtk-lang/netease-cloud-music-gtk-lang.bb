SUMMARY = "Translations for package netease-cloud-music-gtk"
DESCRIPTION = "Provides translations for the 'netease-cloud-music-gtk' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.0"

RPM_NAME = "netease-cloud-music-gtk-lang-2.2.0-1.6.noarch.rpm"
RPM_HASH = "8ff42902fe43fb404ac885c47e8e5c66d48391c60b35ed64550165fbc713d6ac1de40b7b045561f67b4db83910a589355891ee3404febe04f747a7a16b2e93c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-netease-cloud-music-gtk-zh-CN \
netease-cloud-music-gtk-lang \
netease-cloud-music-gtk-lang-all"

RDEPENDS:${PN} += "netease-cloud-music-gtk"

inherit rpm
