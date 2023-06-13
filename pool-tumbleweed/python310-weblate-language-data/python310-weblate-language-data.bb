SUMMARY = "Language Data for Weblate"
DESCRIPTION = "Contains several modules containing language definitions and Gettext \
translations for them (in a way that they would be discovered by Django \
when used as an Django application)."
LICENSE = "MIT"

PV = "2022.9"

RPM_NAME = "python310-weblate-language-data-2022.9-1.3.noarch.rpm"
RPM_HASH = "303b1592440331d1060fcb58f5ef669d1bc7c244a69dea94b66d842deb236816798d37131faa49d7c39c85e0cc6a082c07f8fc718d794bf78dde178b674aff5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-weblate-language-data \
python3.10dist(weblate-language-data) \
python310-weblate-language-data \
python3dist(weblate-language-data)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
