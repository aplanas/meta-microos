SUMMARY = "Translations for package spyder"
DESCRIPTION = "Provides translations for the 'spyder' package."
LICENSE = "MIT"

PV = "5.4.3"

RPM_NAME = "spyder-lang-5.4.3-1.2.noarch.rpm"
RPM_HASH = "e1ef556043736a9cf1e94dfe542d1168bfd55073958a18f377b0bb1ab3f1153ded7f15bda6a5d7ae1f0ab1f1b875604e2e086b62cd89e1560ad82a405af358f6"
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
