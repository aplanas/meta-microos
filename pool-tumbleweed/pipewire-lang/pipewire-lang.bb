SUMMARY = "Translations for package pipewire"
DESCRIPTION = "Provides translations for the 'pipewire' package."
LICENSE = "MIT"

PV = "0.3.74"

RPM_NAME = "pipewire-lang-0.3.74-1.1.noarch.rpm"
RPM_HASH = "839f348808ea31dc10b73c244eff6c117a19772a1cbbab64876ac6088f07de23eecd757060b6cf3c1862b17f89d9c9e8775cc410894a32cf20d120ce68c4be59"
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
