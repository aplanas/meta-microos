SUMMARY = "Translations for package libsoup2"
DESCRIPTION = "Provides translations for the 'libsoup2' package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.74.3"

RPM_NAME = "libsoup2-lang-2.74.3-1.4.noarch.rpm"
RPM_HASH = "a74c1bcfb2b7e5f810b4529e2e84674f05394d2c0d996fedec524cd765d74e1d6d984db38e26ea8797847fa8601ef7adb697a4d98e5e9e028f4fc95691a9cac7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libsoup2-lang \
libsoup2-lang-all \
locale-libsoup2-as \
locale-libsoup2-be \
locale-libsoup2-bg \
locale-libsoup2-bn-IN \
locale-libsoup2-bs \
locale-libsoup2-ca \
locale-libsoup2-ca@valencia \
locale-libsoup2-cs \
locale-libsoup2-da \
locale-libsoup2-de \
locale-libsoup2-el \
locale-libsoup2-en-GB \
locale-libsoup2-eo \
locale-libsoup2-es \
locale-libsoup2-et \
locale-libsoup2-eu \
locale-libsoup2-fa \
locale-libsoup2-fi \
locale-libsoup2-fr \
locale-libsoup2-fur \
locale-libsoup2-gd \
locale-libsoup2-gl \
locale-libsoup2-gu \
locale-libsoup2-he \
locale-libsoup2-hi \
locale-libsoup2-hr \
locale-libsoup2-hu \
locale-libsoup2-id \
locale-libsoup2-it \
locale-libsoup2-ja \
locale-libsoup2-kn \
locale-libsoup2-ko \
locale-libsoup2-lt \
locale-libsoup2-lv \
locale-libsoup2-ml \
locale-libsoup2-mr \
locale-libsoup2-ms \
locale-libsoup2-nb \
locale-libsoup2-ne \
locale-libsoup2-nl \
locale-libsoup2-oc \
locale-libsoup2-or \
locale-libsoup2-pa \
locale-libsoup2-pl \
locale-libsoup2-pt \
locale-libsoup2-pt-BR \
locale-libsoup2-ro \
locale-libsoup2-ru \
locale-libsoup2-sk \
locale-libsoup2-sl \
locale-libsoup2-sr \
locale-libsoup2-sr@latin \
locale-libsoup2-sv \
locale-libsoup2-ta \
locale-libsoup2-te \
locale-libsoup2-th \
locale-libsoup2-tr \
locale-libsoup2-ug \
locale-libsoup2-uk \
locale-libsoup2-vi \
locale-libsoup2-zh-CN \
locale-libsoup2-zh-HK \
locale-libsoup2-zh-TW"

RDEPENDS:${PN} += "libsoup2"

inherit rpm
