SUMMARY = "Translations for wxWidgets"
DESCRIPTION = "Provides translations for wxWidgets."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "wxWidgets-lang-3.0.5.1-4.2.noarch.rpm"
RPM_HASH = "b001e041f3a0143c8f82d02f9cafd97d9990aa6b1da72d1277cc67e905766cf9ad818501564578da3683b5d560499c70e538f74ab9397b2ab1532e3e3a6bde67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-wxWidgets-ca \
locale-wxWidgets-cs \
locale-wxWidgets-da \
locale-wxWidgets-de \
locale-wxWidgets-el \
locale-wxWidgets-es \
locale-wxWidgets-fi \
locale-wxWidgets-fr \
locale-wxWidgets-hu \
locale-wxWidgets-id \
locale-wxWidgets-it \
locale-wxWidgets-ja \
locale-wxWidgets-nl \
locale-wxWidgets-pl \
locale-wxWidgets-ru \
locale-wxWidgets-sl \
locale-wxWidgets-sv \
locale-wxWidgets-tr \
locale-wxWidgets-uk \
locale-wxWidgets-zh-CN \
locale-wxWidgets-zh-TW \
wxWidgets-lang \
wxWidgets-lang-all"

RDEPENDS:${PN} += ""

inherit rpm
