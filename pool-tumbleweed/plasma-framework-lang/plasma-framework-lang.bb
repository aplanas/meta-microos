SUMMARY = "Translations for package plasma-framework"
DESCRIPTION = "Provides translations for the 'plasma-framework' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "5.106.0"

RPM_NAME = "plasma-framework-lang-5.106.0-1.1.noarch.rpm"
RPM_HASH = "5931de3da8b3a3c191106a0824c1a8d42e62b4fb211cab463b104aa498d8ea08aafe8e656907c20d4c0842c99afb5fe89c829cb19b52a3d4dda8fd36c715828c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plasma-framework-ar \
locale-plasma-framework-az \
locale-plasma-framework-be \
locale-plasma-framework-bg \
locale-plasma-framework-bs \
locale-plasma-framework-ca \
locale-plasma-framework-ca@valencia \
locale-plasma-framework-cs \
locale-plasma-framework-da \
locale-plasma-framework-de \
locale-plasma-framework-el \
locale-plasma-framework-en-GB \
locale-plasma-framework-es \
locale-plasma-framework-et \
locale-plasma-framework-eu \
locale-plasma-framework-fi \
locale-plasma-framework-fr \
locale-plasma-framework-gd \
locale-plasma-framework-gl \
locale-plasma-framework-he \
locale-plasma-framework-hu \
locale-plasma-framework-ia \
locale-plasma-framework-id \
locale-plasma-framework-it \
locale-plasma-framework-ja \
locale-plasma-framework-ka \
locale-plasma-framework-ko \
locale-plasma-framework-lt \
locale-plasma-framework-lv \
locale-plasma-framework-ml \
locale-plasma-framework-mr \
locale-plasma-framework-nb \
locale-plasma-framework-nds \
locale-plasma-framework-nl \
locale-plasma-framework-nn \
locale-plasma-framework-pa \
locale-plasma-framework-pl \
locale-plasma-framework-pt \
locale-plasma-framework-pt-BR \
locale-plasma-framework-ro \
locale-plasma-framework-ru \
locale-plasma-framework-sk \
locale-plasma-framework-sl \
locale-plasma-framework-sr \
locale-plasma-framework-sr@ijekavian \
locale-plasma-framework-sr@ijekavianlatin \
locale-plasma-framework-sr@latin \
locale-plasma-framework-sv \
locale-plasma-framework-ta \
locale-plasma-framework-tr \
locale-plasma-framework-ug \
locale-plasma-framework-uk \
locale-plasma-framework-vi \
locale-plasma-framework-zh-CN \
locale-plasma-framework-zh-TW \
plasma-framework-lang \
plasma-framework-lang-all"

RDEPENDS:${PN} += "plasma-framework"

inherit rpm
