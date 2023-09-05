SUMMARY = "Translations for package pipewire"
DESCRIPTION = "Provides translations for the 'pipewire' package."
LICENSE = "MIT"

PV = "0.3.79"

RPM_NAME = "pipewire-lang-0.3.79-1.2.noarch.rpm"
RPM_HASH = "5b53b7175b5e12259c8f32e46ecd88247fb6c00b6123b0b3cea63fbeebec3697f1507a6e79ce88a8f767638b2f27343ad738923c12ec9a9a22a0ae126940d1a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pipewire-af \
locale-pipewire-as \
locale-pipewire-be \
locale-pipewire-bg \
locale-pipewire-bn-IN \
locale-pipewire-ca \
locale-pipewire-cs \
locale-pipewire-da \
locale-pipewire-de \
locale-pipewire-de-CH \
locale-pipewire-el \
locale-pipewire-eo \
locale-pipewire-es \
locale-pipewire-fi \
locale-pipewire-fr \
locale-pipewire-gl \
locale-pipewire-gu \
locale-pipewire-he \
locale-pipewire-hi \
locale-pipewire-hr \
locale-pipewire-hu \
locale-pipewire-id \
locale-pipewire-it \
locale-pipewire-ja \
locale-pipewire-ka \
locale-pipewire-kk \
locale-pipewire-kn \
locale-pipewire-ko \
locale-pipewire-lt \
locale-pipewire-ml \
locale-pipewire-mr \
locale-pipewire-nl \
locale-pipewire-nn \
locale-pipewire-oc \
locale-pipewire-or \
locale-pipewire-pa \
locale-pipewire-pl \
locale-pipewire-pt \
locale-pipewire-pt-BR \
locale-pipewire-ro \
locale-pipewire-ru \
locale-pipewire-si \
locale-pipewire-sk \
locale-pipewire-sr \
locale-pipewire-sr@latin \
locale-pipewire-sv \
locale-pipewire-ta \
locale-pipewire-te \
locale-pipewire-tr \
locale-pipewire-uk \
locale-pipewire-zh-CN \
locale-pipewire-zh-TW \
pipewire-lang \
pipewire-lang-all"

RDEPENDS:${PN} += "pipewire"

inherit rpm
