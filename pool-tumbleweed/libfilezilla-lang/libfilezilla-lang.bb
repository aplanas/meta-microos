SUMMARY = "Translations for package libfilezilla"
DESCRIPTION = "Provides translations for the 'libfilezilla' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.44.0"

RPM_NAME = "libfilezilla-lang-0.44.0-1.1.noarch.rpm"
RPM_HASH = "1943c60e86009e3a43de8882d45f78926d963af62ca86e5cbca507aaafab836ff5a3251c057ee89141d51739668eeba6e11aa64cb06ad0d526e477b7c8ff84f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libfilezilla-lang \
libfilezilla-lang-all \
locale-libfilezilla-ar \
locale-libfilezilla-az \
locale-libfilezilla-ca \
locale-libfilezilla-cs-CZ \
locale-libfilezilla-cy \
locale-libfilezilla-da \
locale-libfilezilla-de \
locale-libfilezilla-el \
locale-libfilezilla-es \
locale-libfilezilla-et \
locale-libfilezilla-eu \
locale-libfilezilla-fi-FI \
locale-libfilezilla-fr \
locale-libfilezilla-hr \
locale-libfilezilla-is \
locale-libfilezilla-it \
locale-libfilezilla-nb-NO \
locale-libfilezilla-ne \
locale-libfilezilla-nl \
locale-libfilezilla-nn-NO \
locale-libfilezilla-oc \
locale-libfilezilla-pl-PL \
locale-libfilezilla-pt-BR \
locale-libfilezilla-pt-PT \
locale-libfilezilla-ru \
locale-libfilezilla-sl-SI \
locale-libfilezilla-sr \
locale-libfilezilla-sv \
locale-libfilezilla-tr \
locale-libfilezilla-uk-UA \
locale-libfilezilla-zh-CN \
locale-libfilezilla-zh-TW"

RDEPENDS:${PN} += "libfilezilla"

inherit rpm
