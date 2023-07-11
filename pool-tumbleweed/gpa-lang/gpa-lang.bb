SUMMARY = "Translations for package gpa"
DESCRIPTION = "Provides translations for the 'gpa' package."
LICENSE = "GPL-3.0-only"

PV = "0.10.0"

RPM_NAME = "gpa-lang-0.10.0-2.17.noarch.rpm"
RPM_HASH = "1cb56fa276ece508c17cf5f734f1c19ff9440f9e9c53d3a86ea54fee33cde6e64d66df8099346834f085317a076c9e04e31803a0016220b6db0a834509743715"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gpa-lang \
gpa-lang-all \
locale-gpa-ar \
locale-gpa-cs \
locale-gpa-de \
locale-gpa-es \
locale-gpa-fr \
locale-gpa-ja \
locale-gpa-nl \
locale-gpa-pl \
locale-gpa-pt-BR \
locale-gpa-ru \
locale-gpa-sv \
locale-gpa-tr \
locale-gpa-zh-CN \
locale-gpa-zh-TW"

RDEPENDS:${PN} += "gpa"

inherit rpm
