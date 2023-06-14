SUMMARY = "Translations for package mate-settings-daemon"
DESCRIPTION = "Provides translations for the 'mate-settings-daemon' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.26.1"

RPM_NAME = "mate-settings-daemon-lang-1.26.1-1.1.noarch.rpm"
RPM_HASH = "f06a876494f036131f36b5375021007f4ba793b79764e975e81ff9483a873b21f0c185cbf34c8bf211d05969a8417dd867301ebce8360dd89c5af72e4c4c29ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mate-settings-daemon-af \
locale-mate-settings-daemon-ar \
locale-mate-settings-daemon-as \
locale-mate-settings-daemon-ast \
locale-mate-settings-daemon-az \
locale-mate-settings-daemon-be \
locale-mate-settings-daemon-bg \
locale-mate-settings-daemon-bn \
locale-mate-settings-daemon-bn-IN \
locale-mate-settings-daemon-br \
locale-mate-settings-daemon-bs \
locale-mate-settings-daemon-ca \
locale-mate-settings-daemon-ca@valencia \
locale-mate-settings-daemon-cs \
locale-mate-settings-daemon-cy \
locale-mate-settings-daemon-da \
locale-mate-settings-daemon-de \
locale-mate-settings-daemon-dz \
locale-mate-settings-daemon-el \
locale-mate-settings-daemon-en-AU \
locale-mate-settings-daemon-en-CA \
locale-mate-settings-daemon-en-GB \
locale-mate-settings-daemon-eo \
locale-mate-settings-daemon-es \
locale-mate-settings-daemon-es-AR \
locale-mate-settings-daemon-es-CL \
locale-mate-settings-daemon-es-CO \
locale-mate-settings-daemon-es-CR \
locale-mate-settings-daemon-es-DO \
locale-mate-settings-daemon-es-EC \
locale-mate-settings-daemon-es-ES \
locale-mate-settings-daemon-es-MX \
locale-mate-settings-daemon-es-NI \
locale-mate-settings-daemon-es-PA \
locale-mate-settings-daemon-es-PE \
locale-mate-settings-daemon-es-PR \
locale-mate-settings-daemon-es-SV \
locale-mate-settings-daemon-es-UY \
locale-mate-settings-daemon-es-VE \
locale-mate-settings-daemon-et \
locale-mate-settings-daemon-eu \
locale-mate-settings-daemon-fa \
locale-mate-settings-daemon-fi \
locale-mate-settings-daemon-fr \
locale-mate-settings-daemon-fur \
locale-mate-settings-daemon-ga \
locale-mate-settings-daemon-gl \
locale-mate-settings-daemon-gu \
locale-mate-settings-daemon-he \
locale-mate-settings-daemon-hi \
locale-mate-settings-daemon-hr \
locale-mate-settings-daemon-hu \
locale-mate-settings-daemon-id \
locale-mate-settings-daemon-is \
locale-mate-settings-daemon-it \
locale-mate-settings-daemon-ja \
locale-mate-settings-daemon-ka \
locale-mate-settings-daemon-kk \
locale-mate-settings-daemon-kn \
locale-mate-settings-daemon-ko \
locale-mate-settings-daemon-lt \
locale-mate-settings-daemon-lv \
locale-mate-settings-daemon-mai \
locale-mate-settings-daemon-mk \
locale-mate-settings-daemon-ml \
locale-mate-settings-daemon-mr \
locale-mate-settings-daemon-ms \
locale-mate-settings-daemon-nb \
locale-mate-settings-daemon-nds \
locale-mate-settings-daemon-ne \
locale-mate-settings-daemon-nl \
locale-mate-settings-daemon-nn \
locale-mate-settings-daemon-oc \
locale-mate-settings-daemon-or \
locale-mate-settings-daemon-pa \
locale-mate-settings-daemon-pl \
locale-mate-settings-daemon-pt \
locale-mate-settings-daemon-pt-BR \
locale-mate-settings-daemon-ro \
locale-mate-settings-daemon-ru \
locale-mate-settings-daemon-si \
locale-mate-settings-daemon-sk \
locale-mate-settings-daemon-sl \
locale-mate-settings-daemon-sq \
locale-mate-settings-daemon-sr \
locale-mate-settings-daemon-sr@latin \
locale-mate-settings-daemon-sv \
locale-mate-settings-daemon-ta \
locale-mate-settings-daemon-te \
locale-mate-settings-daemon-th \
locale-mate-settings-daemon-tr \
locale-mate-settings-daemon-ug \
locale-mate-settings-daemon-uk \
locale-mate-settings-daemon-vi \
locale-mate-settings-daemon-wa \
locale-mate-settings-daemon-zh-CN \
locale-mate-settings-daemon-zh-HK \
locale-mate-settings-daemon-zh-TW \
mate-settings-daemon-lang \
mate-settings-daemon-lang-all"

RDEPENDS:${PN} += "mate-settings-daemon"

inherit rpm
