SUMMARY = "Django form field rendering in templates"
DESCRIPTION = "Tweak the form field rendering in templates, not in python-level form definitions."
LICENSE = "MIT"

PV = "1.4.8"

RPM_NAME = "python310-django-widget-tweaks-1.4.8-1.13.noarch.rpm"
RPM_HASH = "e0c7c7d77741e19d978602dcecd7d6ac29313e6157f6f1c9eee9eda6885389c620da3c459a8feaf892eb0a2446076a488364a9b5a965d2c0b79376fc7a935995"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-widget-tweaks \
python310-django-widget-tweaks \
python3dist-django-widget-tweaks"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
