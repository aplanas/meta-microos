SUMMARY = "Language Data for Weblate"
DESCRIPTION = "Contains several modules containing language definitions and Gettext \
translations for them (in a way that they would be discovered by Django \
when used as an Django application)."
LICENSE = "MIT"

PV = "2022.9"

RPM_NAME = "python311-weblate-language-data-2022.9-1.5.noarch.rpm"
RPM_HASH = "7daea627c828eb9e1c39004787cff3211a90f2e88aca879c645efb794e231d5f42d296b6d94f037164d00d9916cb648ae3d8963661fb83807d5101a164468de5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-weblate-language-data \
python3.11dist-weblate-language-data \
python311-weblate-language-data \
python3dist-weblate-language-data"

RDEPENDS:${PN} += "python-abi"

inherit rpm
