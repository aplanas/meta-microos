SUMMARY = "Translations for package AppStream"
DESCRIPTION = "Provides translations for the 'AppStream' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.16.3"

RPM_NAME = "AppStream-lang-0.16.3-1.1.noarch.rpm"
RPM_HASH = "0377f03108a4a853d2f69305968721a2686901a58721ef5e9a62c147665c361670bb1c39fc434e2d167dea2c43e656012aa0bd781781a557e8b3935a55cffc72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "AppStream-lang \
AppStream-lang-all \
locale-AppStream-ar \
locale-AppStream-bn \
locale-AppStream-ca \
locale-AppStream-cs \
locale-AppStream-da \
locale-AppStream-de \
locale-AppStream-en-GB \
locale-AppStream-eo \
locale-AppStream-es \
locale-AppStream-et \
locale-AppStream-eu \
locale-AppStream-fi \
locale-AppStream-fr \
locale-AppStream-gd \
locale-AppStream-gl \
locale-AppStream-he \
locale-AppStream-hi \
locale-AppStream-hr \
locale-AppStream-hu \
locale-AppStream-id \
locale-AppStream-it \
locale-AppStream-ja \
locale-AppStream-ka \
locale-AppStream-ko \
locale-AppStream-lt \
locale-AppStream-nb \
locale-AppStream-nl \
locale-AppStream-oc \
locale-AppStream-pl \
locale-AppStream-pt \
locale-AppStream-pt-BR \
locale-AppStream-ro \
locale-AppStream-ru \
locale-AppStream-sk \
locale-AppStream-sl \
locale-AppStream-sr \
locale-AppStream-sr@latin \
locale-AppStream-sv \
locale-AppStream-tr \
locale-AppStream-uk \
locale-AppStream-zh-CN \
locale-AppStream-zh-TW"

RDEPENDS:${PN} += "AppStream"

inherit rpm
