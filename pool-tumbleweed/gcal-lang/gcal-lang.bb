SUMMARY = "Translations for package gcal"
DESCRIPTION = "Provides translations for the 'gcal' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.1"

RPM_NAME = "gcal-lang-4.1-3.4.noarch.rpm"
RPM_HASH = "c7e6709bde591b9de539ce6c126b3dc85f840a407e177039da52bb53ad9f3b4cb48825dd1612866da1573e8a65428814fa22a0a0f1dd7f319df85a281e2b2987"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcal-lang \
gcal-lang-all \
locale-gcal-ca \
locale-gcal-da \
locale-gcal-de \
locale-gcal-es \
locale-gcal-fr \
locale-gcal-it \
locale-gcal-lt \
locale-gcal-nl \
locale-gcal-pl \
locale-gcal-ru \
locale-gcal-sv \
locale-gcal-tr \
locale-gcal-zh-CN"

RDEPENDS:${PN} += "gcal"

inherit rpm
