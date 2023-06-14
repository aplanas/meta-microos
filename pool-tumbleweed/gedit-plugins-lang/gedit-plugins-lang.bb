SUMMARY = "Translations for package gedit-plugins"
DESCRIPTION = "Provides translations for the 'gedit-plugins' package."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gedit-plugins-lang-44.1-1.3.noarch.rpm"
RPM_HASH = "7d8e7e6f48d99846e9b8932f8374fa657b64b0345560059f55bca19633f288209363ecd923d4e320139ff01c27da54fb3352c66b88d9471bef5ef06063040e8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gedit-plugins-lang \
gedit-plugins-lang-all \
locale-gedit-plugins-af \
locale-gedit-plugins-ar \
locale-gedit-plugins-as \
locale-gedit-plugins-ast \
locale-gedit-plugins-az \
locale-gedit-plugins-be \
locale-gedit-plugins-be@latin \
locale-gedit-plugins-bg \
locale-gedit-plugins-bn \
locale-gedit-plugins-bn-IN \
locale-gedit-plugins-br \
locale-gedit-plugins-bs \
locale-gedit-plugins-ca \
locale-gedit-plugins-ca@valencia \
locale-gedit-plugins-cs \
locale-gedit-plugins-cy \
locale-gedit-plugins-da \
locale-gedit-plugins-de \
locale-gedit-plugins-dz \
locale-gedit-plugins-el \
locale-gedit-plugins-en-CA \
locale-gedit-plugins-en-GB \
locale-gedit-plugins-en@shaw \
locale-gedit-plugins-eo \
locale-gedit-plugins-es \
locale-gedit-plugins-et \
locale-gedit-plugins-eu \
locale-gedit-plugins-fa \
locale-gedit-plugins-fi \
locale-gedit-plugins-fr \
locale-gedit-plugins-fur \
locale-gedit-plugins-ga \
locale-gedit-plugins-gl \
locale-gedit-plugins-gu \
locale-gedit-plugins-he \
locale-gedit-plugins-hi \
locale-gedit-plugins-hr \
locale-gedit-plugins-hu \
locale-gedit-plugins-id \
locale-gedit-plugins-is \
locale-gedit-plugins-it \
locale-gedit-plugins-ja \
locale-gedit-plugins-ka \
locale-gedit-plugins-kk \
locale-gedit-plugins-kn \
locale-gedit-plugins-ko \
locale-gedit-plugins-lt \
locale-gedit-plugins-lv \
locale-gedit-plugins-mai \
locale-gedit-plugins-mk \
locale-gedit-plugins-ml \
locale-gedit-plugins-mr \
locale-gedit-plugins-ms \
locale-gedit-plugins-nb \
locale-gedit-plugins-nds \
locale-gedit-plugins-ne \
locale-gedit-plugins-nl \
locale-gedit-plugins-nn \
locale-gedit-plugins-oc \
locale-gedit-plugins-or \
locale-gedit-plugins-pa \
locale-gedit-plugins-pl \
locale-gedit-plugins-pt \
locale-gedit-plugins-pt-BR \
locale-gedit-plugins-ro \
locale-gedit-plugins-ru \
locale-gedit-plugins-si \
locale-gedit-plugins-sk \
locale-gedit-plugins-sl \
locale-gedit-plugins-sq \
locale-gedit-plugins-sr \
locale-gedit-plugins-sr@latin \
locale-gedit-plugins-sv \
locale-gedit-plugins-ta \
locale-gedit-plugins-te \
locale-gedit-plugins-th \
locale-gedit-plugins-tr \
locale-gedit-plugins-uk \
locale-gedit-plugins-vi \
locale-gedit-plugins-wa \
locale-gedit-plugins-zh-CN \
locale-gedit-plugins-zh-HK \
locale-gedit-plugins-zh-TW"

RDEPENDS:${PN} += "gedit-plugins"

inherit rpm
