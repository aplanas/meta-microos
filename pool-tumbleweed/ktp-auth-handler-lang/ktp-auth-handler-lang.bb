SUMMARY = "Translations for package ktp-auth-handler"
DESCRIPTION = "Provides translations for the 'ktp-auth-handler' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "ktp-auth-handler-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "e73728f70b4fdf6beebc0860fd84f9aa7ca554445494e188579c61558cee38f8cf7391a177eca7f016b914bfc32c328fa9bd6131ac5e1e6498784a510bad4029"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ktp-auth-handler-lang \
ktp-auth-handler-lang-all \
locale-ktp-auth-handler-ar \
locale-ktp-auth-handler-bs \
locale-ktp-auth-handler-ca \
locale-ktp-auth-handler-ca@valencia \
locale-ktp-auth-handler-cs \
locale-ktp-auth-handler-da \
locale-ktp-auth-handler-de \
locale-ktp-auth-handler-el \
locale-ktp-auth-handler-en-GB \
locale-ktp-auth-handler-es \
locale-ktp-auth-handler-et \
locale-ktp-auth-handler-eu \
locale-ktp-auth-handler-fi \
locale-ktp-auth-handler-fr \
locale-ktp-auth-handler-ga \
locale-ktp-auth-handler-gl \
locale-ktp-auth-handler-hi \
locale-ktp-auth-handler-hu \
locale-ktp-auth-handler-ia \
locale-ktp-auth-handler-it \
locale-ktp-auth-handler-ja \
locale-ktp-auth-handler-ka \
locale-ktp-auth-handler-kk \
locale-ktp-auth-handler-km \
locale-ktp-auth-handler-ko \
locale-ktp-auth-handler-lt \
locale-ktp-auth-handler-mr \
locale-ktp-auth-handler-nb \
locale-ktp-auth-handler-nds \
locale-ktp-auth-handler-nl \
locale-ktp-auth-handler-nn \
locale-ktp-auth-handler-pl \
locale-ktp-auth-handler-pt \
locale-ktp-auth-handler-pt-BR \
locale-ktp-auth-handler-ro \
locale-ktp-auth-handler-ru \
locale-ktp-auth-handler-sk \
locale-ktp-auth-handler-sl \
locale-ktp-auth-handler-sr \
locale-ktp-auth-handler-sr@ijekavian \
locale-ktp-auth-handler-sr@ijekavianlatin \
locale-ktp-auth-handler-sr@latin \
locale-ktp-auth-handler-sv \
locale-ktp-auth-handler-tr \
locale-ktp-auth-handler-ug \
locale-ktp-auth-handler-uk \
locale-ktp-auth-handler-vi \
locale-ktp-auth-handler-zh-CN \
locale-ktp-auth-handler-zh-TW"

RDEPENDS:${PN} += "ktp-auth-handler"

inherit rpm
