SUMMARY = "Translations for package libkgapi"
DESCRIPTION = "Provides translations for the 'libkgapi' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libkgapi-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "9aab3b13a2495b78e41d145b991bbb55baedc98f07252c88d031b0d8a54edb820bc3fa9523ee8c0eccbd8645ee8eb11cf05818da13ab9cf7814ba54dc70fb319"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libkgapi-lang \
libkgapi-lang-all \
locale-libkgapi-ar \
locale-libkgapi-bs \
locale-libkgapi-ca \
locale-libkgapi-ca@valencia \
locale-libkgapi-cs \
locale-libkgapi-da \
locale-libkgapi-de \
locale-libkgapi-el \
locale-libkgapi-en-GB \
locale-libkgapi-es \
locale-libkgapi-et \
locale-libkgapi-eu \
locale-libkgapi-fi \
locale-libkgapi-fr \
locale-libkgapi-ga \
locale-libkgapi-gl \
locale-libkgapi-hu \
locale-libkgapi-ia \
locale-libkgapi-it \
locale-libkgapi-ja \
locale-libkgapi-ka \
locale-libkgapi-kk \
locale-libkgapi-km \
locale-libkgapi-ko \
locale-libkgapi-lt \
locale-libkgapi-mr \
locale-libkgapi-nb \
locale-libkgapi-nds \
locale-libkgapi-nl \
locale-libkgapi-nn \
locale-libkgapi-pl \
locale-libkgapi-pt \
locale-libkgapi-pt-BR \
locale-libkgapi-ro \
locale-libkgapi-ru \
locale-libkgapi-sk \
locale-libkgapi-sl \
locale-libkgapi-sr \
locale-libkgapi-sr@ijekavian \
locale-libkgapi-sr@ijekavianlatin \
locale-libkgapi-sr@latin \
locale-libkgapi-sv \
locale-libkgapi-tr \
locale-libkgapi-ug \
locale-libkgapi-uk \
locale-libkgapi-zh-CN \
locale-libkgapi-zh-TW"

RDEPENDS:${PN} += "libkgapi"

inherit rpm
