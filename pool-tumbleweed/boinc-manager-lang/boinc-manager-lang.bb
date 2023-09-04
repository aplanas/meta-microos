SUMMARY = "Translations for package boinc-manager"
DESCRIPTION = "Provides translations for the 'boinc-manager' package."
LICENSE = "GPL-3.0-or-later | LGPL-3.0-or-later"

PV = "7.24.1"

RPM_NAME = "boinc-manager-lang-7.24.1-1.1.noarch.rpm"
RPM_HASH = "8a86a0b7dc85fb9d95157c5290139ebac7b18adbe4a8ed51866c2a5ac847b79e519937a241084b1c9809e342920debc088a0c831773f4c5875eec564df5ea4e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boinc-manager-lang \
boinc-manager-lang-all \
locale-boinc-manager-bg \
locale-boinc-manager-ca \
locale-boinc-manager-cs \
locale-boinc-manager-da \
locale-boinc-manager-de \
locale-boinc-manager-es \
locale-boinc-manager-fi \
locale-boinc-manager-fr \
locale-boinc-manager-he \
locale-boinc-manager-hu \
locale-boinc-manager-it-IT \
locale-boinc-manager-ja \
locale-boinc-manager-ka \
locale-boinc-manager-ko \
locale-boinc-manager-lv \
locale-boinc-manager-nb \
locale-boinc-manager-nl \
locale-boinc-manager-pl \
locale-boinc-manager-pt-BR \
locale-boinc-manager-ro \
locale-boinc-manager-ru \
locale-boinc-manager-sk \
locale-boinc-manager-sv \
locale-boinc-manager-tr \
locale-boinc-manager-uk \
locale-boinc-manager-zh-CN \
locale-boinc-manager-zh-TW"

RDEPENDS:${PN} += "boinc-manager"

inherit rpm
