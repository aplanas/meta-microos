SUMMARY = "Translations for package libKF5Archive5"
DESCRIPTION = "Provides translations for the 'libKF5Archive5' package."
LICENSE = "LGPL-2.0-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5Archive5-lang-5.108.0-1.1.noarch.rpm"
RPM_HASH = "ac47a48c815696150c3d7d5c5f310fa95ee808e4f4b5e2ad0b8b6a9bb3c91a7fb1c09dabcaa56f1fb421e39f43c7a1cd17cd109b2efa00985fcf98c6a4c512ca"
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
