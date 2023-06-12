SUMMARY = "Vector/OTF versions of openSUSE's 'kbd' fonts"
DESCRIPTION = "These are OpenType remakes of (some of) the VGA bitmap fonts otherwise \
found in the 'kbd' package and in /usr/share/kbd/consolefonts/."
LICENSE = "GPL-2.0-only"

PV = "1.2"

RPM_NAME = "consoleet-kbd-fonts-1.2-1.1.noarch.rpm"
RPM_HASH = "72c9e037d1dc51f4be5a532fc43e9dcbcbcf20279b781fb147ef6e812d2f7ce99ef797658122013ff3d8ecd043a695a06ce7eb6376ab24aef2fa7aa2a8c14a13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "consoleet-kbd-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
