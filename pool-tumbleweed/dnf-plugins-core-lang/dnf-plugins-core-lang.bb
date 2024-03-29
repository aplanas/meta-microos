SUMMARY = "Translations for package dnf-plugins-core"
DESCRIPTION = "Provides translations for the 'dnf-plugins-core' package."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.1"

RPM_NAME = "dnf-plugins-core-lang-4.3.1-2.2.noarch.rpm"
RPM_HASH = "d590e7a029736a28ae68381c42942c4a4b32c98dddc9ec2a53cc6421ff5f014bfdcecb64eca781e0f92600d69798e4650c88edefc554f825ad29c25b0c895a07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dnf-plugins-core-lang \
dnf-plugins-core-lang-all \
locale-dnf-plugins-core-bg \
locale-dnf-plugins-core-ca \
locale-dnf-plugins-core-cs \
locale-dnf-plugins-core-da \
locale-dnf-plugins-core-de \
locale-dnf-plugins-core-es \
locale-dnf-plugins-core-eu \
locale-dnf-plugins-core-fi \
locale-dnf-plugins-core-fr \
locale-dnf-plugins-core-fur \
locale-dnf-plugins-core-hu \
locale-dnf-plugins-core-id \
locale-dnf-plugins-core-it \
locale-dnf-plugins-core-ja \
locale-dnf-plugins-core-ka \
locale-dnf-plugins-core-ko \
locale-dnf-plugins-core-mr \
locale-dnf-plugins-core-nl \
locale-dnf-plugins-core-pa \
locale-dnf-plugins-core-pl \
locale-dnf-plugins-core-pt \
locale-dnf-plugins-core-pt-BR \
locale-dnf-plugins-core-ru \
locale-dnf-plugins-core-si \
locale-dnf-plugins-core-sk \
locale-dnf-plugins-core-sq \
locale-dnf-plugins-core-sr \
locale-dnf-plugins-core-sv \
locale-dnf-plugins-core-tr \
locale-dnf-plugins-core-uk \
locale-dnf-plugins-core-zh-CN \
locale-dnf-plugins-core-zh-TW"

RDEPENDS:${PN} += "dnf-plugins-core"

inherit rpm
