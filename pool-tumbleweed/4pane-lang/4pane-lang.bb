SUMMARY = "Translations for package 4pane"
DESCRIPTION = "Provides translations for the '4pane' package."
LICENSE = "GPL-3.0-only"

PV = "8.0"

RPM_NAME = "4pane-lang-8.0-1.4.noarch.rpm"
RPM_HASH = "8ee3235317e8cfa7533589c8defaa828a14ac832aae0ef69b6f379bd413e7edec1e2a67a168a63f4e059f50ae40255b184a0ce9e5cd268acfc7d0022fbf494bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "4pane-lang \
4pane-lang-all \
locale-4pane-ar \
locale-4pane-ca \
locale-4pane-da \
locale-4pane-de \
locale-4pane-el \
locale-4pane-es \
locale-4pane-et \
locale-4pane-fa \
locale-4pane-fi-FI \
locale-4pane-fr \
locale-4pane-fr-FR \
locale-4pane-it \
locale-4pane-ja \
locale-4pane-nl \
locale-4pane-pl \
locale-4pane-pt-BR \
locale-4pane-ru \
locale-4pane-tr \
locale-4pane-uk-UA \
locale-4pane-vi \
locale-4pane-zh \
locale-4pane-zh-CN \
locale-4pane-zh-TW"

RDEPENDS:${PN} += "4pane"

inherit rpm
