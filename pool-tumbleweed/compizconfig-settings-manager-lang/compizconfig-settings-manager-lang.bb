SUMMARY = "Translations for package compizconfig-settings-manager"
DESCRIPTION = "Provides translations for the 'compizconfig-settings-manager' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "compizconfig-settings-manager-lang-0.8.18-2.10.noarch.rpm"
RPM_HASH = "0ca92919a0158789a4d2a556a1a8968ece43018d69822fe5a066d35522dd8427a19e7c71ddce56b4857c38cbd7e9a3ddf4d9e5d3324031325e7f54b3569a6f5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "compizconfig-settings-manager-lang \
compizconfig-settings-manager-lang-all \
locale-compizconfig-settings-manager-ar \
locale-compizconfig-settings-manager-as \
locale-compizconfig-settings-manager-bg \
locale-compizconfig-settings-manager-bn \
locale-compizconfig-settings-manager-bn-IN \
locale-compizconfig-settings-manager-ca \
locale-compizconfig-settings-manager-cs \
locale-compizconfig-settings-manager-de \
locale-compizconfig-settings-manager-el \
locale-compizconfig-settings-manager-en-GB \
locale-compizconfig-settings-manager-es \
locale-compizconfig-settings-manager-eu \
locale-compizconfig-settings-manager-fa \
locale-compizconfig-settings-manager-fi \
locale-compizconfig-settings-manager-fr \
locale-compizconfig-settings-manager-gl \
locale-compizconfig-settings-manager-gu \
locale-compizconfig-settings-manager-he \
locale-compizconfig-settings-manager-hi \
locale-compizconfig-settings-manager-hr \
locale-compizconfig-settings-manager-hu \
locale-compizconfig-settings-manager-id \
locale-compizconfig-settings-manager-it \
locale-compizconfig-settings-manager-ja \
locale-compizconfig-settings-manager-ko \
locale-compizconfig-settings-manager-nb \
locale-compizconfig-settings-manager-nl \
locale-compizconfig-settings-manager-or \
locale-compizconfig-settings-manager-pa \
locale-compizconfig-settings-manager-pl \
locale-compizconfig-settings-manager-pt \
locale-compizconfig-settings-manager-pt-BR \
locale-compizconfig-settings-manager-ru \
locale-compizconfig-settings-manager-sk \
locale-compizconfig-settings-manager-sv \
locale-compizconfig-settings-manager-tr \
locale-compizconfig-settings-manager-zh-CN"

RDEPENDS:${PN} += "compizconfig-settings-manager"

inherit rpm
