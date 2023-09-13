SUMMARY = "Translations for package zvbi"
DESCRIPTION = "Provides translations for the 'zvbi' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.2.42"

RPM_NAME = "zvbi-lang-0.2.42-1.1.noarch.rpm"
RPM_HASH = "45a6a3738feb0c777f45ec5150dcc7b6fdfd3fea4fafab28f0b2b5da5adbf6a3fc9d410dd8d490ddc3a83ee77472abb955dce874f588544e28e5e518d3b1d120"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-zvbi-de \
locale-zvbi-en@boldquot \
locale-zvbi-en@quot \
locale-zvbi-es \
locale-zvbi-fr \
locale-zvbi-it \
locale-zvbi-ka \
locale-zvbi-nl \
locale-zvbi-pl \
zvbi-lang \
zvbi-lang-all"

RDEPENDS:${PN} += "zvbi"

inherit rpm
