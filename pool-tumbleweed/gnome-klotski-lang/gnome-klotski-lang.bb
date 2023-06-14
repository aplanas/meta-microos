SUMMARY = "Translations for package gnome-klotski"
DESCRIPTION = "Provides translations for the 'gnome-klotski' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.38.2"

RPM_NAME = "gnome-klotski-lang-3.38.2-1.13.noarch.rpm"
RPM_HASH = "e029d7ff7f264e5b0d310e36db3b8720fa067fbee88adc7b75da8bf29db3c8c3f1b05549f2d83e2e71e655a235466cbc6c17feec6f3a4bd80266307fc3f07048"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-klotski-lang \
gnome-klotski-lang-all \
locale-gnome-klotski-af \
locale-gnome-klotski-ar \
locale-gnome-klotski-as \
locale-gnome-klotski-ast \
locale-gnome-klotski-az \
locale-gnome-klotski-be \
locale-gnome-klotski-bg \
locale-gnome-klotski-bn \
locale-gnome-klotski-bn-IN \
locale-gnome-klotski-br \
locale-gnome-klotski-bs \
locale-gnome-klotski-ca \
locale-gnome-klotski-ca@valencia \
locale-gnome-klotski-cs \
locale-gnome-klotski-cy \
locale-gnome-klotski-da \
locale-gnome-klotski-de \
locale-gnome-klotski-dz \
locale-gnome-klotski-el \
locale-gnome-klotski-en-CA \
locale-gnome-klotski-en-GB \
locale-gnome-klotski-en@shaw \
locale-gnome-klotski-eo \
locale-gnome-klotski-es \
locale-gnome-klotski-et \
locale-gnome-klotski-eu \
locale-gnome-klotski-fa \
locale-gnome-klotski-fi \
locale-gnome-klotski-fr \
locale-gnome-klotski-fur \
locale-gnome-klotski-ga \
locale-gnome-klotski-gl \
locale-gnome-klotski-gu \
locale-gnome-klotski-he \
locale-gnome-klotski-hi \
locale-gnome-klotski-hr \
locale-gnome-klotski-hu \
locale-gnome-klotski-id \
locale-gnome-klotski-is \
locale-gnome-klotski-it \
locale-gnome-klotski-ja \
locale-gnome-klotski-ka \
locale-gnome-klotski-kk \
locale-gnome-klotski-km \
locale-gnome-klotski-kn \
locale-gnome-klotski-ko \
locale-gnome-klotski-lt \
locale-gnome-klotski-lv \
locale-gnome-klotski-mai \
locale-gnome-klotski-mk \
locale-gnome-klotski-ml \
locale-gnome-klotski-mr \
locale-gnome-klotski-ms \
locale-gnome-klotski-nb \
locale-gnome-klotski-ne \
locale-gnome-klotski-nl \
locale-gnome-klotski-nn \
locale-gnome-klotski-oc \
locale-gnome-klotski-or \
locale-gnome-klotski-pa \
locale-gnome-klotski-pl \
locale-gnome-klotski-pt \
locale-gnome-klotski-pt-BR \
locale-gnome-klotski-ro \
locale-gnome-klotski-ru \
locale-gnome-klotski-si \
locale-gnome-klotski-sk \
locale-gnome-klotski-sl \
locale-gnome-klotski-sq \
locale-gnome-klotski-sr \
locale-gnome-klotski-sr@latin \
locale-gnome-klotski-sv \
locale-gnome-klotski-ta \
locale-gnome-klotski-te \
locale-gnome-klotski-th \
locale-gnome-klotski-tr \
locale-gnome-klotski-ug \
locale-gnome-klotski-uk \
locale-gnome-klotski-vi \
locale-gnome-klotski-wa \
locale-gnome-klotski-zh-CN \
locale-gnome-klotski-zh-HK \
locale-gnome-klotski-zh-TW"

RDEPENDS:${PN} += "gnome-klotski"

inherit rpm
