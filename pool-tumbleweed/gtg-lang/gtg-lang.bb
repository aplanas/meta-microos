SUMMARY = "Translations for package gtg"
DESCRIPTION = "Provides translations for the 'gtg' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.6"

RPM_NAME = "gtg-lang-0.6-1.5.noarch.rpm"
RPM_HASH = "da74cabc7f444d133a23bc6983cf7e6b43018603925439de43165c8cf16b4f5db0c90bcc94dab98f23ee65f532e2db707d4bef86337bab0953966719794dd8a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtg-lang \
gtg-lang-all \
locale-gtg-af \
locale-gtg-ar \
locale-gtg-ast \
locale-gtg-be \
locale-gtg-bg \
locale-gtg-bn \
locale-gtg-ca \
locale-gtg-cs \
locale-gtg-da \
locale-gtg-de \
locale-gtg-el \
locale-gtg-en-CA \
locale-gtg-en-GB \
locale-gtg-eo \
locale-gtg-es \
locale-gtg-eu \
locale-gtg-fa \
locale-gtg-fi \
locale-gtg-fr \
locale-gtg-gl \
locale-gtg-he \
locale-gtg-hi \
locale-gtg-hr \
locale-gtg-hu \
locale-gtg-ia \
locale-gtg-id \
locale-gtg-is \
locale-gtg-it \
locale-gtg-ja \
locale-gtg-ka \
locale-gtg-ko \
locale-gtg-lt \
locale-gtg-ms \
locale-gtg-nb \
locale-gtg-nds \
locale-gtg-nl \
locale-gtg-oc \
locale-gtg-pl \
locale-gtg-pt \
locale-gtg-pt-BR \
locale-gtg-ro \
locale-gtg-ru \
locale-gtg-si \
locale-gtg-sk \
locale-gtg-sl \
locale-gtg-sq \
locale-gtg-sr \
locale-gtg-sv \
locale-gtg-te \
locale-gtg-th \
locale-gtg-tr \
locale-gtg-uk \
locale-gtg-zh-CN \
locale-gtg-zh-TW"

RDEPENDS:${PN} += "gtg"

inherit rpm
