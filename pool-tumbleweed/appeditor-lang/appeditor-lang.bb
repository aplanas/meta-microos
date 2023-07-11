SUMMARY = "Translations for package appeditor"
DESCRIPTION = "Provides translations for the 'appeditor' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.3"

RPM_NAME = "appeditor-lang-1.1.3-2.5.noarch.rpm"
RPM_HASH = "04d32fc23c63a13321124dd54c5f7fcd0a7c17f8c2d724a671f641c0e9ad5c10c8f4d730c3d497f2cdc2c36b553da5a63999459324062f8502671ac7ea83229e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "appeditor-lang \
appeditor-lang-all \
locale-appeditor-ca \
locale-appeditor-de \
locale-appeditor-es \
locale-appeditor-fr \
locale-appeditor-it \
locale-appeditor-ja \
locale-appeditor-lt \
locale-appeditor-pt \
locale-appeditor-pt-BR \
locale-appeditor-ru \
locale-appeditor-tr"

RDEPENDS:${PN} += "appeditor"

inherit rpm
