SUMMARY = "Translations for package spyder"
DESCRIPTION = "Provides translations for the 'spyder' package."
LICENSE = "MIT"

PV = "5.4.4"

RPM_NAME = "spyder-lang-5.4.4-1.1.noarch.rpm"
RPM_HASH = "a912e06205e16a16c6e07bada71514a4b654fcc4cf753459cf95d17f9880c137c80e9553a164434ece21bd01c2a72756031a761ca4b60a538738c4bf48ee335b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-spyder-de \
locale-spyder-es \
locale-spyder-fr \
locale-spyder-hu \
locale-spyder-ja \
locale-spyder-pl \
locale-spyder-pt-BR \
locale-spyder-ru \
locale-spyder-zh-CN \
spyder-lang \
spyder-lang-all \
spyder3-lang"

RDEPENDS:${PN} += "spyder"

inherit rpm
