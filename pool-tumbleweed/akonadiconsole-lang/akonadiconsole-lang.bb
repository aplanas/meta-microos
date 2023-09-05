SUMMARY = "Translations for package akonadiconsole"
DESCRIPTION = "Provides translations for the 'akonadiconsole' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "akonadiconsole-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "59f3c684ee420ba4afeb408fe4e9263786e9cf8ddd889088b0866c029bda7cb8870db7d01e7089e77823688cf4cd746ee761fded1220b2fc3e1889142f17391a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "akonadiconsole-lang \
akonadiconsole-lang-all \
locale-akonadiconsole-ca \
locale-akonadiconsole-ca@valencia \
locale-akonadiconsole-cs \
locale-akonadiconsole-de \
locale-akonadiconsole-en-GB \
locale-akonadiconsole-es \
locale-akonadiconsole-eu \
locale-akonadiconsole-fi \
locale-akonadiconsole-fr \
locale-akonadiconsole-ia \
locale-akonadiconsole-it \
locale-akonadiconsole-ka \
locale-akonadiconsole-ko \
locale-akonadiconsole-lt \
locale-akonadiconsole-nl \
locale-akonadiconsole-pl \
locale-akonadiconsole-pt \
locale-akonadiconsole-ru \
locale-akonadiconsole-sk \
locale-akonadiconsole-sl \
locale-akonadiconsole-sv \
locale-akonadiconsole-tr \
locale-akonadiconsole-uk \
locale-akonadiconsole-zh-CN"

RDEPENDS:${PN} += "akonadiconsole"

inherit rpm
