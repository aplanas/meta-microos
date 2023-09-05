SUMMARY = "Translations for package glibc"
DESCRIPTION = "Provides translations for the 'glibc' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-2.1-or-later-with-GCC-exception-2.0"

PV = "2.38"

RPM_NAME = "glibc-lang-2.38-2.1.noarch.rpm"
RPM_HASH = "2bb470aff2c50af5b20dffe2efaad9f4a6c825d8e4cd089055c8af7be90184077991e39b508b309a19b3fa5e8b4ec55a90bd2905baeb233f1bae2e46b0a8de7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glibc-lang \
glibc-lang-all \
locale-glibc-be \
locale-glibc-bg \
locale-glibc-ca \
locale-glibc-cs \
locale-glibc-da \
locale-glibc-de \
locale-glibc-el \
locale-glibc-en-GB \
locale-glibc-eo \
locale-glibc-es \
locale-glibc-fi \
locale-glibc-fr \
locale-glibc-gl \
locale-glibc-hr \
locale-glibc-hu \
locale-glibc-ia \
locale-glibc-id \
locale-glibc-it \
locale-glibc-ja \
locale-glibc-ka \
locale-glibc-ko \
locale-glibc-lt \
locale-glibc-nb \
locale-glibc-nl \
locale-glibc-pl \
locale-glibc-pt \
locale-glibc-pt-BR \
locale-glibc-ro \
locale-glibc-ru \
locale-glibc-sk \
locale-glibc-sl \
locale-glibc-sr \
locale-glibc-sv \
locale-glibc-tr \
locale-glibc-uk \
locale-glibc-vi \
locale-glibc-zh-CN \
locale-glibc-zh-TW"

RDEPENDS:${PN} += "glibc"

inherit rpm
