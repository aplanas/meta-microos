SUMMARY = "Translations for package subtitleeditor"
DESCRIPTION = "Provides translations for the 'subtitleeditor' package."
LICENSE = "GPL-3.0"

PV = "0.54.0"

RPM_NAME = "subtitleeditor-lang-0.54.0-4.16.noarch.rpm"
RPM_HASH = "af6e2fa3e07dca868922519414b6fb4d34161eafa7bcb86cb0ae2dcb4611197ff0fab5cb168039305e04924cfcdda125e910992b2b05eb2f5ef804de567c7af9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-subtitleeditor-bg \
locale-subtitleeditor-ca \
locale-subtitleeditor-cs \
locale-subtitleeditor-da \
locale-subtitleeditor-de \
locale-subtitleeditor-el \
locale-subtitleeditor-en-GB \
locale-subtitleeditor-eo \
locale-subtitleeditor-es \
locale-subtitleeditor-fr \
locale-subtitleeditor-gl \
locale-subtitleeditor-hu \
locale-subtitleeditor-it \
locale-subtitleeditor-lt \
locale-subtitleeditor-nl \
locale-subtitleeditor-pl \
locale-subtitleeditor-pt \
locale-subtitleeditor-pt-BR \
locale-subtitleeditor-pt-PT \
locale-subtitleeditor-ru \
locale-subtitleeditor-sr \
locale-subtitleeditor-tr \
locale-subtitleeditor-zh-CN \
locale-subtitleeditor-zh-TW \
subtitleeditor-lang \
subtitleeditor-lang-all"

RDEPENDS:${PN} += "subtitleeditor"

inherit rpm
