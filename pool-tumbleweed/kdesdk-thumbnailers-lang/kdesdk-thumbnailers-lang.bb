SUMMARY = "Translations for package kdesdk-thumbnailers"
DESCRIPTION = "Provides translations for the 'kdesdk-thumbnailers' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kdesdk-thumbnailers-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "cadb3bf835e335698df0897cd0609e50cf78e8bb827c7d50c6c8bbd81c30121dff53a5f31eb6fda8687a61e815807957b7a06f6455acfd47b4fd8ed528d7e845"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdesdk-thumbnailers-lang \
kdesdk-thumbnailers-lang-all \
locale-kdesdk-thumbnailers-ar \
locale-kdesdk-thumbnailers-bg \
locale-kdesdk-thumbnailers-bs \
locale-kdesdk-thumbnailers-ca \
locale-kdesdk-thumbnailers-ca@valencia \
locale-kdesdk-thumbnailers-cs \
locale-kdesdk-thumbnailers-da \
locale-kdesdk-thumbnailers-de \
locale-kdesdk-thumbnailers-el \
locale-kdesdk-thumbnailers-en-GB \
locale-kdesdk-thumbnailers-es \
locale-kdesdk-thumbnailers-et \
locale-kdesdk-thumbnailers-eu \
locale-kdesdk-thumbnailers-fi \
locale-kdesdk-thumbnailers-fr \
locale-kdesdk-thumbnailers-ga \
locale-kdesdk-thumbnailers-gl \
locale-kdesdk-thumbnailers-hi \
locale-kdesdk-thumbnailers-hu \
locale-kdesdk-thumbnailers-id \
locale-kdesdk-thumbnailers-is \
locale-kdesdk-thumbnailers-it \
locale-kdesdk-thumbnailers-ja \
locale-kdesdk-thumbnailers-ka \
locale-kdesdk-thumbnailers-kk \
locale-kdesdk-thumbnailers-ko \
locale-kdesdk-thumbnailers-lt \
locale-kdesdk-thumbnailers-mr \
locale-kdesdk-thumbnailers-nb \
locale-kdesdk-thumbnailers-nds \
locale-kdesdk-thumbnailers-nl \
locale-kdesdk-thumbnailers-nn \
locale-kdesdk-thumbnailers-pa \
locale-kdesdk-thumbnailers-pl \
locale-kdesdk-thumbnailers-pt \
locale-kdesdk-thumbnailers-pt-BR \
locale-kdesdk-thumbnailers-ro \
locale-kdesdk-thumbnailers-ru \
locale-kdesdk-thumbnailers-sk \
locale-kdesdk-thumbnailers-sl \
locale-kdesdk-thumbnailers-sv \
locale-kdesdk-thumbnailers-tr \
locale-kdesdk-thumbnailers-ug \
locale-kdesdk-thumbnailers-uk \
locale-kdesdk-thumbnailers-vi \
locale-kdesdk-thumbnailers-zh-CN \
locale-kdesdk-thumbnailers-zh-TW"

RDEPENDS:${PN} += "kdesdk-thumbnailers"

inherit rpm
