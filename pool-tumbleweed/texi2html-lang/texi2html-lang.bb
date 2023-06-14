SUMMARY = "Translations for package texi2html"
DESCRIPTION = "Provides translations for the 'texi2html' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.0"

RPM_NAME = "texi2html-lang-5.0-5.2.noarch.rpm"
RPM_HASH = "a7929fdd8617ff9e62eebe3c01affe54c6ee61b3816c8ae32e28aaa8933b2df6115405b54ab8e66ebb8cc0d95cb11fc9b91b0ab35e1be8d4349b2516c8f63908"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texi2html-cs \
locale-texi2html-da \
locale-texi2html-de \
locale-texi2html-de-AT \
locale-texi2html-eo \
locale-texi2html-es \
locale-texi2html-fr \
locale-texi2html-he \
locale-texi2html-hr \
locale-texi2html-hu \
locale-texi2html-id \
locale-texi2html-it \
locale-texi2html-ja \
locale-texi2html-nb \
locale-texi2html-nl \
locale-texi2html-pl \
locale-texi2html-ro \
locale-texi2html-ru \
locale-texi2html-sv \
locale-texi2html-tr \
locale-texi2html-vi \
locale-texi2html-zh-CN \
locale-texi2html-zh-TW \
texi2html-lang \
texi2html-lang-all"

RDEPENDS:${PN} += "texi2html"

inherit rpm
