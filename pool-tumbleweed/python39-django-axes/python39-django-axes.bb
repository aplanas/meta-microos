SUMMARY = "Keep track of failed login attempts in Django-powered sites"
DESCRIPTION = "Keep track of failed login attempts in Django-powered sites."
LICENSE = "MIT"

PV = "5.40.1"

RPM_NAME = "python39-django-axes-5.40.1-1.5.noarch.rpm"
RPM_HASH = "b63adb2328d16c47d9fa4693e457036e95f5638a072b9f3a678083870092d3db007783aedab79f0f7e4581df93e72022212c5d277073f1900792edb2e56baf8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-axes \
python39-django-axes \
python3dist-django-axes"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-django-ipware"

inherit rpm
