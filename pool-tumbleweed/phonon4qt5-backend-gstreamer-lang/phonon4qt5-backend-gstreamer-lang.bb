SUMMARY = "Translations for package phonon4qt5-backend-gstreamer"
DESCRIPTION = "Provides translations for the 'phonon4qt5-backend-gstreamer' package."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.10.0"

RPM_NAME = "phonon4qt5-backend-gstreamer-lang-4.10.0-1.21.noarch.rpm"
RPM_HASH = "91246896710d1f83437b8d62a936e0d85edd3831c1b8a189429541aee866908a748d78f716262fe61f5fc0339c5770c24ce537cbc56f1716b9f36a1912a2dfd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-phonon4qt5-backend-gstreamer-ar \
locale-phonon4qt5-backend-gstreamer-ast \
locale-phonon4qt5-backend-gstreamer-bg \
locale-phonon4qt5-backend-gstreamer-bs \
locale-phonon4qt5-backend-gstreamer-ca \
locale-phonon4qt5-backend-gstreamer-ca@valencia \
locale-phonon4qt5-backend-gstreamer-cs \
locale-phonon4qt5-backend-gstreamer-da \
locale-phonon4qt5-backend-gstreamer-de \
locale-phonon4qt5-backend-gstreamer-el \
locale-phonon4qt5-backend-gstreamer-en-GB \
locale-phonon4qt5-backend-gstreamer-eo \
locale-phonon4qt5-backend-gstreamer-es \
locale-phonon4qt5-backend-gstreamer-et \
locale-phonon4qt5-backend-gstreamer-eu \
locale-phonon4qt5-backend-gstreamer-fi \
locale-phonon4qt5-backend-gstreamer-fr \
locale-phonon4qt5-backend-gstreamer-ga \
locale-phonon4qt5-backend-gstreamer-gl \
locale-phonon4qt5-backend-gstreamer-he \
locale-phonon4qt5-backend-gstreamer-hr \
locale-phonon4qt5-backend-gstreamer-hu \
locale-phonon4qt5-backend-gstreamer-id \
locale-phonon4qt5-backend-gstreamer-is \
locale-phonon4qt5-backend-gstreamer-it \
locale-phonon4qt5-backend-gstreamer-ja \
locale-phonon4qt5-backend-gstreamer-kk \
locale-phonon4qt5-backend-gstreamer-ko \
locale-phonon4qt5-backend-gstreamer-lt \
locale-phonon4qt5-backend-gstreamer-lv \
locale-phonon4qt5-backend-gstreamer-mai \
locale-phonon4qt5-backend-gstreamer-mr \
locale-phonon4qt5-backend-gstreamer-nb \
locale-phonon4qt5-backend-gstreamer-nds \
locale-phonon4qt5-backend-gstreamer-nl \
locale-phonon4qt5-backend-gstreamer-nn \
locale-phonon4qt5-backend-gstreamer-pa \
locale-phonon4qt5-backend-gstreamer-pl \
locale-phonon4qt5-backend-gstreamer-pt \
locale-phonon4qt5-backend-gstreamer-pt-BR \
locale-phonon4qt5-backend-gstreamer-ro \
locale-phonon4qt5-backend-gstreamer-ru \
locale-phonon4qt5-backend-gstreamer-sk \
locale-phonon4qt5-backend-gstreamer-sl \
locale-phonon4qt5-backend-gstreamer-sq \
locale-phonon4qt5-backend-gstreamer-sr \
locale-phonon4qt5-backend-gstreamer-sr@ijekavian \
locale-phonon4qt5-backend-gstreamer-sr@ijekavianlatin \
locale-phonon4qt5-backend-gstreamer-sr@latin \
locale-phonon4qt5-backend-gstreamer-sv \
locale-phonon4qt5-backend-gstreamer-th \
locale-phonon4qt5-backend-gstreamer-tr \
locale-phonon4qt5-backend-gstreamer-ug \
locale-phonon4qt5-backend-gstreamer-uk \
locale-phonon4qt5-backend-gstreamer-zh-CN \
locale-phonon4qt5-backend-gstreamer-zh-TW \
phonon4qt5-backend-gstreamer-lang \
phonon4qt5-backend-gstreamer-lang-all"

RDEPENDS:${PN} += "phonon4qt5-backend-gstreamer"

inherit rpm
