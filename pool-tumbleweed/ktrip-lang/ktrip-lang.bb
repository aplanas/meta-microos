SUMMARY = "Translations for package ktrip"
DESCRIPTION = "Provides translations for the 'ktrip' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "ktrip-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "569569beacd346bbcc8ecec64e866c5c08a6431cd45b60ce720621ad099733e48d76f03b067b01d73087ccc1c150ad17610bc5375f497e5c63f788318c8ad2d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ktrip-lang \
ktrip-lang-all \
locale-ktrip-ca \
locale-ktrip-ca@valencia \
locale-ktrip-cs \
locale-ktrip-de \
locale-ktrip-en-GB \
locale-ktrip-es \
locale-ktrip-et \
locale-ktrip-eu \
locale-ktrip-fi \
locale-ktrip-fr \
locale-ktrip-gl \
locale-ktrip-ia \
locale-ktrip-it \
locale-ktrip-ja \
locale-ktrip-ka \
locale-ktrip-ko \
locale-ktrip-lt \
locale-ktrip-nl \
locale-ktrip-nn \
locale-ktrip-pl \
locale-ktrip-pt \
locale-ktrip-pt-BR \
locale-ktrip-ru \
locale-ktrip-sk \
locale-ktrip-sl \
locale-ktrip-sv \
locale-ktrip-tr \
locale-ktrip-uk \
locale-ktrip-zh-CN \
locale-ktrip-zh-TW"

RDEPENDS:${PN} += "ktrip"

inherit rpm
