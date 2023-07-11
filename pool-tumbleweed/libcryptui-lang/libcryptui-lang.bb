SUMMARY = "Translations for package libcryptui"
DESCRIPTION = "Provides translations for the 'libcryptui' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.12.2"

RPM_NAME = "libcryptui-lang-3.12.2-10.4.noarch.rpm"
RPM_HASH = "a6c68c86ecb1226a6464e57583da778499510b02da57f9db5eb655acee4ca2d930e77ff51fdead6aef7ec7c0d2318949e6fb6944bb3b4d93df59cd6570daecc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libcryptui-lang \
libcryptui-lang-all \
locale-libcryptui-ar \
locale-libcryptui-as \
locale-libcryptui-ast \
locale-libcryptui-az \
locale-libcryptui-be@latin \
locale-libcryptui-bg \
locale-libcryptui-bn \
locale-libcryptui-bn-IN \
locale-libcryptui-br \
locale-libcryptui-ca \
locale-libcryptui-ca@valencia \
locale-libcryptui-cs \
locale-libcryptui-cy \
locale-libcryptui-da \
locale-libcryptui-de \
locale-libcryptui-dz \
locale-libcryptui-el \
locale-libcryptui-en-CA \
locale-libcryptui-en-GB \
locale-libcryptui-en@shaw \
locale-libcryptui-eo \
locale-libcryptui-es \
locale-libcryptui-et \
locale-libcryptui-eu \
locale-libcryptui-fi \
locale-libcryptui-fr \
locale-libcryptui-ga \
locale-libcryptui-gl \
locale-libcryptui-gu \
locale-libcryptui-he \
locale-libcryptui-hi \
locale-libcryptui-hr \
locale-libcryptui-hu \
locale-libcryptui-id \
locale-libcryptui-it \
locale-libcryptui-ja \
locale-libcryptui-kn \
locale-libcryptui-ko \
locale-libcryptui-lt \
locale-libcryptui-lv \
locale-libcryptui-mai \
locale-libcryptui-mk \
locale-libcryptui-ml \
locale-libcryptui-mr \
locale-libcryptui-ms \
locale-libcryptui-nb \
locale-libcryptui-ne \
locale-libcryptui-nl \
locale-libcryptui-nn \
locale-libcryptui-oc \
locale-libcryptui-or \
locale-libcryptui-pa \
locale-libcryptui-pl \
locale-libcryptui-pt \
locale-libcryptui-pt-BR \
locale-libcryptui-ro \
locale-libcryptui-ru \
locale-libcryptui-si \
locale-libcryptui-sk \
locale-libcryptui-sl \
locale-libcryptui-sq \
locale-libcryptui-sr \
locale-libcryptui-sr@latin \
locale-libcryptui-sv \
locale-libcryptui-ta \
locale-libcryptui-te \
locale-libcryptui-th \
locale-libcryptui-tr \
locale-libcryptui-ug \
locale-libcryptui-uk \
locale-libcryptui-vi \
locale-libcryptui-zh-CN \
locale-libcryptui-zh-HK \
locale-libcryptui-zh-TW"

RDEPENDS:${PN} += "libcryptui"

inherit rpm
