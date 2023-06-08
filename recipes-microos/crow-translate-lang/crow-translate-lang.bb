SUMMARY = "Translations for package crow-translate"
DESCRIPTION = "Provides translations for the 'crow-translate' package."
LICENSE = "GPL-3.0-only"

PV = "2.10.0"

RPM_NAME = "crow-translate-lang-2.10.0-1.4.noarch.rpm"
RPM_HASH = "d1adf52b32735333fe7bf15261ea92a6cb9e25237623d3edd58a56c76f3e86d903b36508e8e3199be05967d8eaec4668fb8909c1905c0b2394cde4e0226c0459"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "crow-translate-lang crow-translate-lang-all"
RDEPENDS:${PN} += "crow-translate"

inherit rpm
