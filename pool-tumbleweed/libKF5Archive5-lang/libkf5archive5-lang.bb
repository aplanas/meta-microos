SUMMARY = "Translations for package libKF5Archive5"
DESCRIPTION = "Provides translations for the 'libKF5Archive5' package."
LICENSE = "LGPL-2.0-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5Archive5-lang-5.109.0-1.1.noarch.rpm"
RPM_HASH = "32ce007f03eb8b348a2456209e830ba5a0c1b655809373b0a5c51e815ef079fddd6957d37b299492c1eee2f66b4750be946687bb16d0d072a6ea82935ce06b7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKF5Archive5-lang \
libKF5Archive5-lang-all \
locale-libKF5Archive5-ar \
locale-libKF5Archive5-ca \
locale-libKF5Archive5-ca@valencia \
locale-libKF5Archive5-cs \
locale-libKF5Archive5-de \
locale-libKF5Archive5-en-GB \
locale-libKF5Archive5-es \
locale-libKF5Archive5-fi \
locale-libKF5Archive5-fr \
locale-libKF5Archive5-gl \
locale-libKF5Archive5-ia \
locale-libKF5Archive5-id \
locale-libKF5Archive5-it \
locale-libKF5Archive5-ja \
locale-libKF5Archive5-ka \
locale-libKF5Archive5-ko \
locale-libKF5Archive5-lt \
locale-libKF5Archive5-nl \
locale-libKF5Archive5-nn \
locale-libKF5Archive5-pl \
locale-libKF5Archive5-pt \
locale-libKF5Archive5-ru \
locale-libKF5Archive5-sk \
locale-libKF5Archive5-sl \
locale-libKF5Archive5-sv \
locale-libKF5Archive5-tr \
locale-libKF5Archive5-uk \
locale-libKF5Archive5-zh-CN \
locale-libKF5Archive5-zh-TW"

RDEPENDS:${PN} += "libKF5Archive5"

inherit rpm
