SUMMARY = "Translations for package gajim"
DESCRIPTION = "Provides translations for the 'gajim' package."
LICENSE = "GPL-3.0-only"

PV = "1.8.0"

RPM_NAME = "gajim-lang-1.8.0-1.2.noarch.rpm"
RPM_HASH = "abe0820f93792abbad7cb68b41bb7e679b34c49e7ad69578cffd003814423a4ec4abbbe56c3e09e9e4c4b66a208ab882754ac6024554dbe9c71d58660ab9deaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gajim-lang \
gajim-lang-all \
locale-gajim-ar \
locale-gajim-be \
locale-gajim-be@latin \
locale-gajim-bg \
locale-gajim-br \
locale-gajim-ca \
locale-gajim-cs \
locale-gajim-da \
locale-gajim-de \
locale-gajim-el \
locale-gajim-en-GB \
locale-gajim-eo \
locale-gajim-es \
locale-gajim-eu \
locale-gajim-fr \
locale-gajim-gl \
locale-gajim-he \
locale-gajim-hr \
locale-gajim-hu \
locale-gajim-it \
locale-gajim-ja \
locale-gajim-kk \
locale-gajim-ko \
locale-gajim-lt \
locale-gajim-nb-NO \
locale-gajim-nl \
locale-gajim-pl \
locale-gajim-pt \
locale-gajim-pt-BR \
locale-gajim-ro \
locale-gajim-ru \
locale-gajim-sk \
locale-gajim-sr \
locale-gajim-sv \
locale-gajim-tr \
locale-gajim-uk \
locale-gajim-zh-CN \
locale-gajim-zh-TW"

RDEPENDS:${PN} += "gajim"

inherit rpm
