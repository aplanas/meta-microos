SUMMARY = "Translations for package kdesdk-thumbnailers"
DESCRIPTION = "Provides translations for the 'kdesdk-thumbnailers' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kdesdk-thumbnailers-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "9fdfc3cafa10ddbea07f95565ab14c46085ea3e3b7cba0828da6d8ca81dca3c179434c03d41aacaa315ac07b7df75bbc819698f2767a191af04afbbca96a83fd"
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
locale-kdesdk-thumbnailers-eo \
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
