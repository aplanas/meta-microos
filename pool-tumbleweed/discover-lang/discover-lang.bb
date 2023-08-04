SUMMARY = "Translations for package discover"
DESCRIPTION = "Provides translations for the 'discover' package."
LICENSE = "GPL-2.0-only & GPL-3.0-only & GPL-3.0-or-later"

PV = "5.27.7"

RPM_NAME = "discover-lang-5.27.7-1.1.noarch.rpm"
RPM_HASH = "cd3ea979f6cd3d11201a2776df6ed11f00608ca2812770e3be2e3d6277aaa742efddd8e841f8c78e4bbe3e3685879ba9fe5cc9c1a3a37764a577f1dbbc9ed038"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "discover-lang \
discover-lang-all \
locale-discover-ar \
locale-discover-az \
locale-discover-bg \
locale-discover-bs \
locale-discover-ca \
locale-discover-ca@valencia \
locale-discover-cs \
locale-discover-da \
locale-discover-de \
locale-discover-el \
locale-discover-en-GB \
locale-discover-es \
locale-discover-et \
locale-discover-eu \
locale-discover-fi \
locale-discover-fr \
locale-discover-ga \
locale-discover-gl \
locale-discover-he \
locale-discover-hi \
locale-discover-hu \
locale-discover-ia \
locale-discover-id \
locale-discover-it \
locale-discover-ja \
locale-discover-ka \
locale-discover-kk \
locale-discover-ko \
locale-discover-lt \
locale-discover-ml \
locale-discover-mr \
locale-discover-nb \
locale-discover-nds \
locale-discover-nl \
locale-discover-nn \
locale-discover-pa \
locale-discover-pl \
locale-discover-pt \
locale-discover-pt-BR \
locale-discover-ro \
locale-discover-ru \
locale-discover-sk \
locale-discover-sl \
locale-discover-sr \
locale-discover-sr@ijekavian \
locale-discover-sr@ijekavianlatin \
locale-discover-sr@latin \
locale-discover-sv \
locale-discover-ta \
locale-discover-tr \
locale-discover-ug \
locale-discover-uk \
locale-discover-vi \
locale-discover-zh-CN \
locale-discover-zh-TW"

RDEPENDS:${PN} += "discover"

inherit rpm
