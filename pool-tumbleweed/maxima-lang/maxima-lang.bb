SUMMARY = "Translations for package maxima"
DESCRIPTION = "Provides translations for the maxima package."
LICENSE = "GPL-2.0-or-later"

PV = "5.47.0"

RPM_NAME = "maxima-lang-5.47.0-1.3.noarch.rpm"
RPM_HASH = "ae12e9a01d9180cff29c97908c71e9b4976f14978f8af6c0a9117f5728d27202293f9c91eae199e3c08844ef5356a35741fc0eb6fb562d11b3501fc342da9a33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-maxima-es \
locale-maxima-pt \
maxima-lang \
maxima-lang-de-utf8 \
maxima-lang-es-utf8 \
maxima-lang-pt-BR-utf8 \
maxima-lang-pt-utf8"

RDEPENDS:${PN} += "maxima"

inherit rpm
