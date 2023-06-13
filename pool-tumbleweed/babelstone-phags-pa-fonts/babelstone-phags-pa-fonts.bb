SUMMARY = "Font for Phags Pa Script"
DESCRIPTION = "BabelStone Phags-pa Book, BabelStone Phags-pa Tibetan A and BabelStone \
Phags-pa Tibetan B are different styles of Phags-pa fonts, with OpenType \
features that allow complex joining and shaping behaviour."
LICENSE = "OFL-1.1"

PV = "2.0"

RPM_NAME = "babelstone-phags-pa-fonts-2.0-3.17.noarch.rpm"
RPM_HASH = "776218feffe7f7d4cac6b367c9f28d712a7ff4ed5acb534055a603bd68f4d84a988dd9636d452f549e243ad922b9e841503cd381651119cd7e4cf5682f217bb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "babelstone-phags-pa-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
