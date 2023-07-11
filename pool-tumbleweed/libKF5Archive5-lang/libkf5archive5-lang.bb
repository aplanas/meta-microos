SUMMARY = "Translations for package libKF5Archive5"
DESCRIPTION = "Provides translations for the 'libKF5Archive5' package."
LICENSE = "LGPL-2.0-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5Archive5-lang-5.107.0-1.1.noarch.rpm"
RPM_HASH = "a467b19bd7ef20da21a866f052f0960df2e55aa8974ce3e2b7684c993ef284f968ce5c2f41c7c0e1630729e4756f014933b84aa4e6eceeec6d894ec24f3d5bb7"
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
locale-libKF5Archive5-ia \
locale-libKF5Archive5-id \
locale-libKF5Archive5-it \
locale-libKF5Archive5-ja \
locale-libKF5Archive5-ka \
locale-libKF5Archive5-lt \
locale-libKF5Archive5-nl \
locale-libKF5Archive5-nn \
locale-libKF5Archive5-pl \
locale-libKF5Archive5-pt \
locale-libKF5Archive5-ru \
locale-libKF5Archive5-sk \
locale-libKF5Archive5-sl \
locale-libKF5Archive5-tr \
locale-libKF5Archive5-uk \
locale-libKF5Archive5-zh-CN \
locale-libKF5Archive5-zh-TW"

RDEPENDS:${PN} += "libKF5Archive5"

inherit rpm
