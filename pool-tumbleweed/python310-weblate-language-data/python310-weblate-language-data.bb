SUMMARY = "Language Data for Weblate"
DESCRIPTION = "Contains several modules containing language definitions and Gettext \
translations for them (in a way that they would be discovered by Django \
when used as an Django application)."
LICENSE = "MIT"

PV = "2022.9"

RPM_NAME = "python310-weblate-language-data-2022.9-1.5.noarch.rpm"
RPM_HASH = "f9b22e5e03da974a25b9c9dfbb210f720ca8f0f2e8201ea21c7f9b50e491da10613eb886494185335bca3a54766a0c22ab8f0626548c06c976282c8bbfb2b449"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-weblate-language-data \
python310-weblate-language-data \
python3dist-weblate-language-data"

RDEPENDS:${PN} += "python-abi"

inherit rpm
