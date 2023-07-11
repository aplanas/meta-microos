SUMMARY = "Django form field rendering in templates"
DESCRIPTION = "Tweak the form field rendering in templates, not in python-level form definitions."
LICENSE = "MIT"

PV = "1.4.8"

RPM_NAME = "python311-django-widget-tweaks-1.4.8-1.13.noarch.rpm"
RPM_HASH = "cc95fad48a3fe8a71225cc6ac0c83ce8b93ee4bcb71b343d3bb074a6f1a788e685011cf4a53862de292a15f66a10ceb9f35250b8d00dab80ab6ac1f70a609f40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-widget-tweaks \
python3.11dist-django-widget-tweaks \
python311-django-widget-tweaks \
python3dist-django-widget-tweaks"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
