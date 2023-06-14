SUMMARY = "Translations for package netease-cloud-music-gtk"
DESCRIPTION = "Provides translations for the 'netease-cloud-music-gtk' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.0"

RPM_NAME = "netease-cloud-music-gtk-lang-2.2.0-1.4.noarch.rpm"
RPM_HASH = "600c2b0ca382f2c91def1cfee78b079e53109418fefac6023d4ea2465f3107fbdde2a4567310964b7d7675ee5ae15be8fd3e699307273f80414a14f9bca01e94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-netease-cloud-music-gtk-zh-CN \
netease-cloud-music-gtk-lang \
netease-cloud-music-gtk-lang-all"

RDEPENDS:${PN} += "netease-cloud-music-gtk"

inherit rpm
