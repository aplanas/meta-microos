SUMMARY = "Keep track of failed login attempts in Django-powered sites"
DESCRIPTION = "Keep track of failed login attempts in Django-powered sites."
LICENSE = "MIT"

PV = "5.40.1"

RPM_NAME = "python310-django-axes-5.40.1-1.5.noarch.rpm"
RPM_HASH = "425d2b8b2c6fac3b3727a6d4a354b4e685cab661d385de7dada62451b414631911993996bd5a4da33aaad8285ae62c0e65fda20b2fbbc8d73462ca5384ea18a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-axes \
python310-django-axes \
python3dist-django-axes"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-django-ipware"

inherit rpm
