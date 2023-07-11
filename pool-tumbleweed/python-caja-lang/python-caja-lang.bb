SUMMARY = "Translations for package python-caja"
DESCRIPTION = "Provides translations for the 'python-caja' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "python-caja-lang-1.26.0-1.11.noarch.rpm"
RPM_HASH = "e1316ca5a318248a2b53007ee3fae3dfb11951536bbfe3489ddc1606325743da83410a7589fa2ae2f59f446de986dea0c6ea17cbd716655c83a3f494547f6698"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-python-caja-ar \
locale-python-caja-ast \
locale-python-caja-be \
locale-python-caja-bg \
locale-python-caja-br \
locale-python-caja-bs \
locale-python-caja-ca \
locale-python-caja-ca@valencia \
locale-python-caja-cs \
locale-python-caja-cy \
locale-python-caja-da \
locale-python-caja-de \
locale-python-caja-el \
locale-python-caja-en-AU \
locale-python-caja-en-GB \
locale-python-caja-eo \
locale-python-caja-es \
locale-python-caja-es-AR \
locale-python-caja-es-CL \
locale-python-caja-es-CO \
locale-python-caja-es-ES \
locale-python-caja-et \
locale-python-caja-eu \
locale-python-caja-fa \
locale-python-caja-fi \
locale-python-caja-fr \
locale-python-caja-fr-CA \
locale-python-caja-gl \
locale-python-caja-gu \
locale-python-caja-he \
locale-python-caja-hi \
locale-python-caja-hr \
locale-python-caja-hu \
locale-python-caja-id \
locale-python-caja-is \
locale-python-caja-it \
locale-python-caja-ja \
locale-python-caja-kk \
locale-python-caja-ko \
locale-python-caja-lt \
locale-python-caja-lv \
locale-python-caja-ms \
locale-python-caja-nb \
locale-python-caja-nds \
locale-python-caja-ne \
locale-python-caja-nl \
locale-python-caja-oc \
locale-python-caja-pl \
locale-python-caja-pt \
locale-python-caja-pt-BR \
locale-python-caja-ro \
locale-python-caja-ru \
locale-python-caja-sk \
locale-python-caja-sl \
locale-python-caja-sq \
locale-python-caja-sr \
locale-python-caja-sv \
locale-python-caja-th \
locale-python-caja-tr \
locale-python-caja-uk \
locale-python-caja-vi \
locale-python-caja-zh-CN \
locale-python-caja-zh-HK \
locale-python-caja-zh-TW \
python-caja-lang \
python-caja-lang-all"

RDEPENDS:${PN} += "python-caja"

inherit rpm
