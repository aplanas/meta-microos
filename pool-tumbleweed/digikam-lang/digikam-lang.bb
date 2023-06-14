SUMMARY = "Translations for package digikam"
DESCRIPTION = "Provides translations for the 'digikam' package."
LICENSE = "GPL-2.0-or-later"

PV = "8.0.0"

RPM_NAME = "digikam-lang-8.0.0-3.2.noarch.rpm"
RPM_HASH = "76aff8632a57f69a22ed2f3d975e10be6afe8f58ab567af6fc1f006e12072493ac5d1ad4d0b7e8a535fed645db987869a21f79c93420054070d957e3b2515da6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "digikam-lang \
digikam-lang-all \
locale-digikam-ar \
locale-digikam-be \
locale-digikam-bg \
locale-digikam-bs \
locale-digikam-ca \
locale-digikam-ca@valencia \
locale-digikam-cs \
locale-digikam-da \
locale-digikam-de \
locale-digikam-el \
locale-digikam-en-GB \
locale-digikam-eo \
locale-digikam-es \
locale-digikam-et \
locale-digikam-eu \
locale-digikam-fa \
locale-digikam-fi \
locale-digikam-fr \
locale-digikam-ga \
locale-digikam-gl \
locale-digikam-he \
locale-digikam-hi \
locale-digikam-hr \
locale-digikam-hu \
locale-digikam-id \
locale-digikam-is \
locale-digikam-it \
locale-digikam-ja \
locale-digikam-ka \
locale-digikam-km \
locale-digikam-ko \
locale-digikam-lt \
locale-digikam-lv \
locale-digikam-mai \
locale-digikam-mr \
locale-digikam-ms \
locale-digikam-nb \
locale-digikam-nds \
locale-digikam-ne \
locale-digikam-nl \
locale-digikam-nn \
locale-digikam-oc \
locale-digikam-pa \
locale-digikam-pl \
locale-digikam-pt \
locale-digikam-pt-BR \
locale-digikam-ro \
locale-digikam-ru \
locale-digikam-sk \
locale-digikam-sl \
locale-digikam-sq \
locale-digikam-sv \
locale-digikam-th \
locale-digikam-tr \
locale-digikam-ug \
locale-digikam-uk \
locale-digikam-vi \
locale-digikam-zh-CN \
locale-digikam-zh-TW"

RDEPENDS:${PN} += "digikam"

inherit rpm
