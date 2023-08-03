SUMMARY = "Translations for package smplayer"
DESCRIPTION = "Provides translations for the 'smplayer' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.6.0"

RPM_NAME = "smplayer-lang-23.6.0-1.1.noarch.rpm"
RPM_HASH = "b03d3adf8d4d003f3cf9a995b5a104b3b0bf81a26a95357024e49f4094c64752704d7210a570eb77073c6f7c8946e388ba5e6db515d91a6a7f5eed1dbdbd0d14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "smplayer-lang \
smplayer-lang-all"

RDEPENDS:${PN} += "smplayer"

inherit rpm
