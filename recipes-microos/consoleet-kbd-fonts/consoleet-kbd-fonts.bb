SUMMARY = "Vector/OTF versions of openSUSE's 'kbd' fonts"
DESCRIPTION = "These are OpenType remakes of (some of) the VGA bitmap fonts otherwise \
found in the 'kbd' package and in /usr/share/kbd/consolefonts/."
LICENSE = "GPL-2.0"

PV = "1.0"

RPM_NAME = "consoleet-kbd-fonts-1.0-1.6.noarch.rpm"
RPM_HASH = "a61a001d9c5d12c632baab74f2515f29c711895bd3358346f4077667e3a704de33485c016446536d7284ab7a286d13f53b77403062b0fc6e75bfa21190acc0ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "consoleet-kbd-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
