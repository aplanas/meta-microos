SUMMARY = "Translations for package tar"
DESCRIPTION = "Provides translations for the 'tar' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.34"

RPM_NAME = "tar-lang-1.34-12.1.noarch.rpm"
RPM_HASH = "ede21861fe4faf3ee3d437d96f264773acc79042ecdf9b78801f7294942f21ac99101e5bf40aa159f23bbd1db8310dc7c4f48940a6cef7de4101b4eb2d5a9bbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tar-bg \
locale-tar-ca \
locale-tar-cs \
locale-tar-da \
locale-tar-de \
locale-tar-el \
locale-tar-eo \
locale-tar-es \
locale-tar-et \
locale-tar-eu \
locale-tar-fi \
locale-tar-fr \
locale-tar-ga \
locale-tar-gl \
locale-tar-hr \
locale-tar-hu \
locale-tar-id \
locale-tar-it \
locale-tar-ja \
locale-tar-ko \
locale-tar-ms \
locale-tar-nb \
locale-tar-nl \
locale-tar-pl \
locale-tar-pt \
locale-tar-pt-BR \
locale-tar-ro \
locale-tar-ru \
locale-tar-sk \
locale-tar-sl \
locale-tar-sr \
locale-tar-sv \
locale-tar-tr \
locale-tar-uk \
locale-tar-vi \
locale-tar-zh-CN \
locale-tar-zh-TW \
tar-lang \
tar-lang-all"

RDEPENDS:${PN} += "tar"

inherit rpm
