SUMMARY = "Translations for package font-manager"
DESCRIPTION = "Provides translations for the 'font-manager' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.8.8"

RPM_NAME = "font-manager-lang-0.8.8-2.4.noarch.rpm"
RPM_HASH = "cc47bf13392c87452d35f3a2e5dcf092753e395abfd9f64c1a6f009f3f9fa1d9d9e5a3eccb1de1bc4c2915cc840fea3d978b0875c97e6f732bdd308dcde0b91d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-manager-lang \
font-manager-lang-all \
locale-font-manager-ar \
locale-font-manager-ca \
locale-font-manager-de \
locale-font-manager-eo \
locale-font-manager-es \
locale-font-manager-fr \
locale-font-manager-hr \
locale-font-manager-id \
locale-font-manager-it \
locale-font-manager-ja \
locale-font-manager-nb-NO \
locale-font-manager-nl \
locale-font-manager-oc \
locale-font-manager-pl \
locale-font-manager-pt-BR \
locale-font-manager-ro \
locale-font-manager-ru \
locale-font-manager-si \
locale-font-manager-sl \
locale-font-manager-sv \
locale-font-manager-tr \
locale-font-manager-uk \
locale-font-manager-zh-CN \
locale-font-manager-zh-HK \
locale-font-manager-zh-TW"

RDEPENDS:${PN} += "font-manager"

inherit rpm
