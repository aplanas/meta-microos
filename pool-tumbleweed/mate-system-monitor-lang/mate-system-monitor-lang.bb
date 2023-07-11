SUMMARY = "Translations for package mate-system-monitor"
DESCRIPTION = "Provides translations for the 'mate-system-monitor' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "mate-system-monitor-lang-1.26.0-1.10.noarch.rpm"
RPM_HASH = "6ad25cb7a5cc81f3b78b0c4ef0bd060bb591702a2b4e95addf31671eb80fa880ebb0d06813e5f18f06f83189ee40fdd55acb8e76221ec6cb4e0a84c508fb5495"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mate-system-monitor-af \
locale-mate-system-monitor-ar \
locale-mate-system-monitor-as \
locale-mate-system-monitor-ast \
locale-mate-system-monitor-az \
locale-mate-system-monitor-be \
locale-mate-system-monitor-bg \
locale-mate-system-monitor-bn \
locale-mate-system-monitor-bn-IN \
locale-mate-system-monitor-br \
locale-mate-system-monitor-bs \
locale-mate-system-monitor-ca \
locale-mate-system-monitor-ca@valencia \
locale-mate-system-monitor-cs \
locale-mate-system-monitor-cy \
locale-mate-system-monitor-da \
locale-mate-system-monitor-de \
locale-mate-system-monitor-dz \
locale-mate-system-monitor-el \
locale-mate-system-monitor-en-AU \
locale-mate-system-monitor-en-CA \
locale-mate-system-monitor-en-GB \
locale-mate-system-monitor-eo \
locale-mate-system-monitor-es \
locale-mate-system-monitor-es-AR \
locale-mate-system-monitor-es-CL \
locale-mate-system-monitor-es-CO \
locale-mate-system-monitor-es-CR \
locale-mate-system-monitor-es-DO \
locale-mate-system-monitor-es-EC \
locale-mate-system-monitor-es-ES \
locale-mate-system-monitor-es-MX \
locale-mate-system-monitor-es-NI \
locale-mate-system-monitor-es-PA \
locale-mate-system-monitor-es-PE \
locale-mate-system-monitor-es-PR \
locale-mate-system-monitor-es-SV \
locale-mate-system-monitor-es-UY \
locale-mate-system-monitor-es-VE \
locale-mate-system-monitor-et \
locale-mate-system-monitor-eu \
locale-mate-system-monitor-fa \
locale-mate-system-monitor-fi \
locale-mate-system-monitor-fr \
locale-mate-system-monitor-fur \
locale-mate-system-monitor-ga \
locale-mate-system-monitor-gl \
locale-mate-system-monitor-gu \
locale-mate-system-monitor-he \
locale-mate-system-monitor-hi \
locale-mate-system-monitor-hr \
locale-mate-system-monitor-hu \
locale-mate-system-monitor-ia \
locale-mate-system-monitor-id \
locale-mate-system-monitor-is \
locale-mate-system-monitor-it \
locale-mate-system-monitor-ja \
locale-mate-system-monitor-ka \
locale-mate-system-monitor-kk \
locale-mate-system-monitor-kn \
locale-mate-system-monitor-ko \
locale-mate-system-monitor-lt \
locale-mate-system-monitor-lv \
locale-mate-system-monitor-mai \
locale-mate-system-monitor-mk \
locale-mate-system-monitor-ml \
locale-mate-system-monitor-mr \
locale-mate-system-monitor-ms \
locale-mate-system-monitor-nb \
locale-mate-system-monitor-nds \
locale-mate-system-monitor-ne \
locale-mate-system-monitor-nl \
locale-mate-system-monitor-nn \
locale-mate-system-monitor-oc \
locale-mate-system-monitor-or \
locale-mate-system-monitor-pa \
locale-mate-system-monitor-pl \
locale-mate-system-monitor-pt \
locale-mate-system-monitor-pt-BR \
locale-mate-system-monitor-ro \
locale-mate-system-monitor-ru \
locale-mate-system-monitor-si \
locale-mate-system-monitor-sk \
locale-mate-system-monitor-sl \
locale-mate-system-monitor-sq \
locale-mate-system-monitor-sr \
locale-mate-system-monitor-sr@latin \
locale-mate-system-monitor-sv \
locale-mate-system-monitor-ta \
locale-mate-system-monitor-te \
locale-mate-system-monitor-th \
locale-mate-system-monitor-tr \
locale-mate-system-monitor-ug \
locale-mate-system-monitor-uk \
locale-mate-system-monitor-vi \
locale-mate-system-monitor-wa \
locale-mate-system-monitor-zh-CN \
locale-mate-system-monitor-zh-HK \
locale-mate-system-monitor-zh-TW \
mate-system-monitor-lang \
mate-system-monitor-lang-all"

RDEPENDS:${PN} += "mate-system-monitor"

inherit rpm
