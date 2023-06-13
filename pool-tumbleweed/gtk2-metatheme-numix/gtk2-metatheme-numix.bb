SUMMARY = "Numix GTK+2 Theme"
DESCRIPTION = "Numix is a modern flat theme with a combination of light and dark \
elements. It supports MATE, GNOME, Xfce, and Openbox. \
This package contains the GTK+2 theme."
LICENSE = "GPL-3.0-or-later"

PV = "2.6.7.1617863126.0d6b4c8"

RPM_NAME = "gtk2-metatheme-numix-2.6.7.1617863126.0d6b4c8-2.6.noarch.rpm"
RPM_HASH = "1d082e1419e43b34e1a04fbeae2e4f05ec4cd8cfadde71b5e4131a2698357f5bfd3e3ed4670fdd03f24a84517f4bc7a93f921ee96ff55336c6e41c7344961e6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-metatheme-numix"

RDEPENDS:${PN} += "gtk2-engine-murrine \
metatheme-numix-common"

inherit rpm
