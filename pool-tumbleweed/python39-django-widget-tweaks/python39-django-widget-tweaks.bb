SUMMARY = "Django form field rendering in templates"
DESCRIPTION = "Tweak the form field rendering in templates, not in python-level form definitions."
LICENSE = "MIT"

PV = "1.4.8"

RPM_NAME = "python39-django-widget-tweaks-1.4.8-1.13.noarch.rpm"
RPM_HASH = "442bce89d3019cd343116dd6e54b4cdbd0a6d5e340fb79951823824b8a67851f10e435f1663acda0ec844a48cbfe221d9e47ded2b570157b52dadbb372ba4a9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-widget-tweaks \
python39-django-widget-tweaks \
python3dist-django-widget-tweaks"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
