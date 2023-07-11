SUMMARY = "Translations for package rednotebook"
DESCRIPTION = "Provides translations for the 'rednotebook' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.29.6"

RPM_NAME = "rednotebook-lang-2.29.6-1.2.noarch.rpm"
RPM_HASH = "02e273804b9b9dd041950ef981f5f9fa3374d79837d66421c2b28b00f3d58e132ef0e66a7e6021a10435619f096e0cd40241c365f53dea6c03c4b0f9dfb72aa1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-rednotebook-ar \
locale-rednotebook-ast \
locale-rednotebook-be \
locale-rednotebook-bg \
locale-rednotebook-bs \
locale-rednotebook-ca \
locale-rednotebook-cs \
locale-rednotebook-cy \
locale-rednotebook-da \
locale-rednotebook-de \
locale-rednotebook-el \
locale-rednotebook-en-GB \
locale-rednotebook-eo \
locale-rednotebook-es \
locale-rednotebook-eu \
locale-rednotebook-fi \
locale-rednotebook-fr \
locale-rednotebook-ga \
locale-rednotebook-gl \
locale-rednotebook-he \
locale-rednotebook-hi \
locale-rednotebook-hr \
locale-rednotebook-hu \
locale-rednotebook-id \
locale-rednotebook-it \
locale-rednotebook-ja \
locale-rednotebook-ka \
locale-rednotebook-kk \
locale-rednotebook-ko \
locale-rednotebook-lt \
locale-rednotebook-ml \
locale-rednotebook-ms \
locale-rednotebook-nb \
locale-rednotebook-nds \
locale-rednotebook-nl \
locale-rednotebook-nn \
locale-rednotebook-oc \
locale-rednotebook-pl \
locale-rednotebook-pt \
locale-rednotebook-pt-BR \
locale-rednotebook-ro \
locale-rednotebook-ru \
locale-rednotebook-si \
locale-rednotebook-sk \
locale-rednotebook-sl \
locale-rednotebook-sr \
locale-rednotebook-sv \
locale-rednotebook-ta \
locale-rednotebook-te \
locale-rednotebook-tr \
locale-rednotebook-ug \
locale-rednotebook-uk \
locale-rednotebook-vi \
locale-rednotebook-zh-CN \
locale-rednotebook-zh-HK \
locale-rednotebook-zh-TW \
rednotebook-lang \
rednotebook-lang-all"

RDEPENDS:${PN} += "rednotebook"

inherit rpm
