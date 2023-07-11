SUMMARY = "Translations for package dialog"
DESCRIPTION = "Provides translations for the 'dialog' package."
LICENSE = "LGPL-2.1-only"

PV = "1.3"

RPM_NAME = "dialog-lang-1.3-10.1.noarch.rpm"
RPM_HASH = "d669aef6760714ed14c8929fe72cb34cac93e8051467ad7e145efe985040d7b887fba8155c6ae016bc854991c151de9469e5387a59bcc124ed7a5ccb323815da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dialog-lang \
dialog-lang-all \
locale-dialog-ar \
locale-dialog-ast \
locale-dialog-be@latin \
locale-dialog-bg \
locale-dialog-ca \
locale-dialog-cs \
locale-dialog-cy \
locale-dialog-da \
locale-dialog-de \
locale-dialog-el \
locale-dialog-eo \
locale-dialog-es \
locale-dialog-et \
locale-dialog-eu \
locale-dialog-fa \
locale-dialog-fi \
locale-dialog-fr \
locale-dialog-fur \
locale-dialog-ga \
locale-dialog-gd \
locale-dialog-gl \
locale-dialog-hi \
locale-dialog-hr \
locale-dialog-hu \
locale-dialog-ia \
locale-dialog-id \
locale-dialog-is \
locale-dialog-it \
locale-dialog-ja \
locale-dialog-ka \
locale-dialog-lt \
locale-dialog-lv \
locale-dialog-mk \
locale-dialog-ms \
locale-dialog-nb \
locale-dialog-nl \
locale-dialog-pl \
locale-dialog-pt \
locale-dialog-pt-BR \
locale-dialog-ro \
locale-dialog-ru \
locale-dialog-sk \
locale-dialog-sl \
locale-dialog-sq \
locale-dialog-sr \
locale-dialog-sv \
locale-dialog-th \
locale-dialog-tr \
locale-dialog-uk \
locale-dialog-vi \
locale-dialog-wa \
locale-dialog-zh-CN \
locale-dialog-zh-TW"

RDEPENDS:${PN} += "dialog"

inherit rpm
