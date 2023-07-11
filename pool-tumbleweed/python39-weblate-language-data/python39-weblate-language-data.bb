SUMMARY = "Language Data for Weblate"
DESCRIPTION = "Contains several modules containing language definitions and Gettext \
translations for them (in a way that they would be discovered by Django \
when used as an Django application)."
LICENSE = "MIT"

PV = "2022.9"

RPM_NAME = "python39-weblate-language-data-2022.9-1.5.noarch.rpm"
RPM_HASH = "5f21276a223615714a054e226fe0f46e4a97ec80cb5353ada354738b13a2f324db55f712a51ddfc8ff4ac417342e9fbaee5f8bdd9450d2079ffada72b6080e6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-weblate-language-data \
python39-weblate-language-data \
python3dist-weblate-language-data"

RDEPENDS:${PN} += "python-abi"

inherit rpm
