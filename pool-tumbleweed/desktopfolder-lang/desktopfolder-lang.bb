SUMMARY = "Translations for package desktopfolder"
DESCRIPTION = "Provides translations for the 'desktopfolder' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.3"

RPM_NAME = "desktopfolder-lang-1.1.3-3.8.noarch.rpm"
RPM_HASH = "72182465cc38e6ae1059a369e230f52b0444ec76f1b960e8871259b96b3d28146fc408a259e4509679f756e60d69de6dd082edbc9f42a905dd80519bbe5e5041"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "desktopfolder-lang \
desktopfolder-lang-all \
locale-desktopfolder-bg \
locale-desktopfolder-ca \
locale-desktopfolder-cs \
locale-desktopfolder-da \
locale-desktopfolder-de-DE \
locale-desktopfolder-en-GB \
locale-desktopfolder-eo \
locale-desktopfolder-es \
locale-desktopfolder-fi \
locale-desktopfolder-fr \
locale-desktopfolder-fr-FR \
locale-desktopfolder-hu \
locale-desktopfolder-it \
locale-desktopfolder-ja \
locale-desktopfolder-lt \
locale-desktopfolder-oc \
locale-desktopfolder-pl \
locale-desktopfolder-pt-BR \
locale-desktopfolder-pt-PT \
locale-desktopfolder-ru \
locale-desktopfolder-tr \
locale-desktopfolder-uk \
locale-desktopfolder-zh-CN"

RDEPENDS:${PN} += "desktopfolder"

inherit rpm
