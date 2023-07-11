SUMMARY = "Translations for package pulseaudio"
DESCRIPTION = "Provides translations for the 'pulseaudio' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "16.1"

RPM_NAME = "pulseaudio-lang-16.1-4.1.noarch.rpm"
RPM_HASH = "b6fc99017d5c81817057d21bf0f8b829952834a0d0c8c87bdedf78c204570dc176b8171dd460ed3b98c4174d46060ef09347e8541573ebdff81a4ea9a9889e38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pulseaudio-af \
locale-pulseaudio-as \
locale-pulseaudio-be \
locale-pulseaudio-bg \
locale-pulseaudio-bn-IN \
locale-pulseaudio-ca \
locale-pulseaudio-cs \
locale-pulseaudio-da \
locale-pulseaudio-de \
locale-pulseaudio-de-CH \
locale-pulseaudio-el \
locale-pulseaudio-eo \
locale-pulseaudio-es \
locale-pulseaudio-fi \
locale-pulseaudio-fr \
locale-pulseaudio-gl \
locale-pulseaudio-gu \
locale-pulseaudio-he \
locale-pulseaudio-hi \
locale-pulseaudio-hr \
locale-pulseaudio-hu \
locale-pulseaudio-id \
locale-pulseaudio-it \
locale-pulseaudio-ja \
locale-pulseaudio-ka \
locale-pulseaudio-kk \
locale-pulseaudio-kn \
locale-pulseaudio-ko \
locale-pulseaudio-lt \
locale-pulseaudio-ml \
locale-pulseaudio-mr \
locale-pulseaudio-nl \
locale-pulseaudio-nn \
locale-pulseaudio-oc \
locale-pulseaudio-or \
locale-pulseaudio-pa \
locale-pulseaudio-pl \
locale-pulseaudio-pt \
locale-pulseaudio-pt-BR \
locale-pulseaudio-ru \
locale-pulseaudio-si \
locale-pulseaudio-sk \
locale-pulseaudio-sr \
locale-pulseaudio-sr@latin \
locale-pulseaudio-sv \
locale-pulseaudio-ta \
locale-pulseaudio-te \
locale-pulseaudio-tr \
locale-pulseaudio-uk \
locale-pulseaudio-zh-CN \
locale-pulseaudio-zh-TW \
pulseaudio-lang \
pulseaudio-lang-all"

RDEPENDS:${PN} += "pulseaudio"

inherit rpm
