SUMMARY = "Django form field rendering in templates"
DESCRIPTION = "Tweak the form field rendering in templates, not in python-level form definitions."
LICENSE = "MIT"

PV = "1.4.8"

RPM_NAME = "python39-django-widget-tweaks-1.4.8-1.11.noarch.rpm"
RPM_HASH = "d426acf9b7146e172b13aaa72c240721109a015e441d52ab5465ea35777e6dc72691d87b8a07de329794097d2d4e18adb379d935769cbb6cb49a37be88169708"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-widget-tweaks \
python39-django-widget-tweaks \
python3dist-django-widget-tweaks"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
