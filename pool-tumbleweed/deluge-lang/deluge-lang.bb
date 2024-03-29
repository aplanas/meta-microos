SUMMARY = "Translations for package deluge"
DESCRIPTION = "Provides translations for the 'deluge' package."
LICENSE = "SUSE-GPL-3.0-with-openssl-exception"

PV = "2.1.1"

RPM_NAME = "deluge-lang-2.1.1-3.6.noarch.rpm"
RPM_HASH = "5cbbf2ae82717daaac748c3360a5d4b3d3615fa441647ac9fca378df5a19190a8df6c9dbce9b2592f715730652ae65afbee940948d3a54764c3a7af722fc062a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deluge-lang \
deluge-lang-all \
locale-deluge-af \
locale-deluge-ar \
locale-deluge-ast \
locale-deluge-be \
locale-deluge-bg \
locale-deluge-bn \
locale-deluge-bs \
locale-deluge-ca \
locale-deluge-cs \
locale-deluge-cy \
locale-deluge-da \
locale-deluge-de \
locale-deluge-el \
locale-deluge-en-AU \
locale-deluge-en-CA \
locale-deluge-en-GB \
locale-deluge-eo \
locale-deluge-es \
locale-deluge-et \
locale-deluge-eu \
locale-deluge-fa \
locale-deluge-fi \
locale-deluge-fr \
locale-deluge-ga \
locale-deluge-gl \
locale-deluge-he \
locale-deluge-hi \
locale-deluge-hr \
locale-deluge-hu \
locale-deluge-id \
locale-deluge-is \
locale-deluge-it \
locale-deluge-ja \
locale-deluge-ka \
locale-deluge-kk \
locale-deluge-km \
locale-deluge-kn \
locale-deluge-ko \
locale-deluge-lt \
locale-deluge-lv \
locale-deluge-mk \
locale-deluge-ml \
locale-deluge-ms \
locale-deluge-nb \
locale-deluge-nds \
locale-deluge-nl \
locale-deluge-nn \
locale-deluge-oc \
locale-deluge-pl \
locale-deluge-pt \
locale-deluge-pt-BR \
locale-deluge-ro \
locale-deluge-ru \
locale-deluge-si \
locale-deluge-sk \
locale-deluge-sl \
locale-deluge-sr \
locale-deluge-sv \
locale-deluge-ta \
locale-deluge-te \
locale-deluge-th \
locale-deluge-tr \
locale-deluge-uk \
locale-deluge-vi \
locale-deluge-zh-CN \
locale-deluge-zh-HK \
locale-deluge-zh-TW"

RDEPENDS:${PN} += "deluge"

inherit rpm
