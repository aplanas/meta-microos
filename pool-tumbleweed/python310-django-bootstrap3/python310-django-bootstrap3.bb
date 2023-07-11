SUMMARY = "Bootstrap support for Django projects"
DESCRIPTION = "Bootstrap support for Django projects."
LICENSE = "BSD-3-Clause"

PV = "14.2.0"

RPM_NAME = "python310-django-bootstrap3-14.2.0-2.8.noarch.rpm"
RPM_HASH = "c92eb6f59c27ec6c2e922f14c2648f0b2d821267ae62396ae8ba1246125c2bb7372d9163b1b9e9ff4cad48b5e1ba3b437d443b3668918328d3a71755dbfe4940"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-bootstrap3 \
python310-django-bootstrap3 \
python3dist-django-bootstrap3"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
