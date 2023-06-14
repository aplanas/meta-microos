SUMMARY = "Translations for package kirigami"
DESCRIPTION = "Provides translations for the 'kirigami' package."
LICENSE = "LGPL-2.1+"

PV = "1.1.0"

RPM_NAME = "kirigami-lang-1.1.0-1.32.noarch.rpm"
RPM_HASH = "b7f991896c637ad3af7cf546fbac1f69fb9f5dd65efcfc8f3bd1c11de25ad080ac8b2176c76c5a623109819c145c2613c421d4022b914258c2e9078efd7f61d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kirigami-lang \
kirigami-lang-all \
locale-kirigami-ca \
locale-kirigami-ca@valencia \
locale-kirigami-cs \
locale-kirigami-de \
locale-kirigami-en-GB \
locale-kirigami-es \
locale-kirigami-nl \
locale-kirigami-pl \
locale-kirigami-pt \
locale-kirigami-pt-BR \
locale-kirigami-sk \
locale-kirigami-sl \
locale-kirigami-sv \
locale-kirigami-uk \
locale-kirigami-zh-TW"

RDEPENDS:${PN} += "kirigami"

inherit rpm
