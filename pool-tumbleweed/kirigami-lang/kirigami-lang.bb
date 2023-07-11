SUMMARY = "Translations for package kirigami"
DESCRIPTION = "Provides translations for the 'kirigami' package."
LICENSE = "LGPL-2.1+"

PV = "1.1.0"

RPM_NAME = "kirigami-lang-1.1.0-1.33.noarch.rpm"
RPM_HASH = "1aab98b1236940528fc337363ec91a61f402e115beaf9d8db6f8fa09e60d2d837bd727ead68d61651d140809333b5e63e59d56ffce81fbb417b2c6b00d1731f4"
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
