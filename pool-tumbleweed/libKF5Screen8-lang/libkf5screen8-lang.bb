SUMMARY = "Translations for package libKF5Screen8"
DESCRIPTION = "Provides translations for the 'libKF5Screen8' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "libKF5Screen8-lang-5.27.5-1.1.noarch.rpm"
RPM_HASH = "48a965017e23382dfff28ebc395124f3017996ad524d20c564c378d9564da7cb148d4784fc9e2febe7e52888029e18a77a6286a6c72701b741bc5eb13c64607d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKF5Screen8-lang \
libKF5Screen8-lang-all \
locale-libKF5Screen8-ca \
locale-libKF5Screen8-ca@valencia \
locale-libKF5Screen8-cs \
locale-libKF5Screen8-de \
locale-libKF5Screen8-en-GB \
locale-libKF5Screen8-es \
locale-libKF5Screen8-eu \
locale-libKF5Screen8-fi \
locale-libKF5Screen8-fr \
locale-libKF5Screen8-gl \
locale-libKF5Screen8-it \
locale-libKF5Screen8-ja \
locale-libKF5Screen8-ka \
locale-libKF5Screen8-ko \
locale-libKF5Screen8-nl \
locale-libKF5Screen8-nn \
locale-libKF5Screen8-pl \
locale-libKF5Screen8-pt \
locale-libKF5Screen8-pt-BR \
locale-libKF5Screen8-ru \
locale-libKF5Screen8-sk \
locale-libKF5Screen8-sl \
locale-libKF5Screen8-tr \
locale-libKF5Screen8-uk \
locale-libKF5Screen8-zh-CN \
locale-libKF5Screen8-zh-TW"

RDEPENDS:${PN} += "libKF5Screen8"

inherit rpm
