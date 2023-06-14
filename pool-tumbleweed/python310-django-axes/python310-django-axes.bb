SUMMARY = "Keep track of failed login attempts in Django-powered sites"
DESCRIPTION = "Keep track of failed login attempts in Django-powered sites."
LICENSE = "MIT"

PV = "5.40.1"

RPM_NAME = "python310-django-axes-5.40.1-1.3.noarch.rpm"
RPM_HASH = "f984f87bcaaf57aa1348449bb0861d633aa14de458528d0cae5e7b3b21b8e4c5dbd124dd3a25b32d1dab719e30058380c39a65d791b78799d1ff2864169e4b44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-axes \
python3.10dist-django-axes \
python310-django-axes \
python3dist-django-axes"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-django-ipware"

inherit rpm
