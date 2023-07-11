SUMMARY = "Translations for package breeze5-style"
DESCRIPTION = "Provides translations for the 'breeze5-style' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.6"

RPM_NAME = "breeze5-style-lang-5.27.6-1.1.noarch.rpm"
RPM_HASH = "2e3c555504bad81d6188e81238fed8c9a876550b4257b73024bd071612823192385a46158ad493f0a0069f8c638b508953d0d823b9a98ef4ade795628bea1f35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "breeze5-style-lang \
breeze5-style-lang-all \
locale-breeze5-style-ar \
locale-breeze5-style-az \
locale-breeze5-style-bg \
locale-breeze5-style-bs \
locale-breeze5-style-ca \
locale-breeze5-style-ca@valencia \
locale-breeze5-style-cs \
locale-breeze5-style-da \
locale-breeze5-style-de \
locale-breeze5-style-el \
locale-breeze5-style-en-GB \
locale-breeze5-style-es \
locale-breeze5-style-et \
locale-breeze5-style-eu \
locale-breeze5-style-fi \
locale-breeze5-style-fr \
locale-breeze5-style-gl \
locale-breeze5-style-he \
locale-breeze5-style-hi \
locale-breeze5-style-hu \
locale-breeze5-style-ia \
locale-breeze5-style-id \
locale-breeze5-style-is \
locale-breeze5-style-it \
locale-breeze5-style-ja \
locale-breeze5-style-ka \
locale-breeze5-style-ko \
locale-breeze5-style-lt \
locale-breeze5-style-ml \
locale-breeze5-style-nb \
locale-breeze5-style-nds \
locale-breeze5-style-nl \
locale-breeze5-style-nn \
locale-breeze5-style-pa \
locale-breeze5-style-pl \
locale-breeze5-style-pt \
locale-breeze5-style-pt-BR \
locale-breeze5-style-ro \
locale-breeze5-style-ru \
locale-breeze5-style-sk \
locale-breeze5-style-sl \
locale-breeze5-style-sr \
locale-breeze5-style-sr@ijekavian \
locale-breeze5-style-sr@ijekavianlatin \
locale-breeze5-style-sr@latin \
locale-breeze5-style-sv \
locale-breeze5-style-ta \
locale-breeze5-style-tr \
locale-breeze5-style-uk \
locale-breeze5-style-zh-CN \
locale-breeze5-style-zh-TW"

RDEPENDS:${PN} += "breeze5-style"

inherit rpm
