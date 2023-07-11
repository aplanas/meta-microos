SUMMARY = "Extensions for Django"
DESCRIPTION = "Django-extensions bundles several useful \
additions for Django projects."
LICENSE = "BSD-3-Clause"

PV = "3.2.3"

RPM_NAME = "python311-django-extensions-3.2.3-2.1.noarch.rpm"
RPM_HASH = "039715ee19fc5eb1f57f00afb16a5797466bae62dae71c46e7d7f9349d02090ab62c34eef08f5d29af10174b498febddef58fb16d508ab0a14c2c8ab6540f4b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-extensions \
python3.11dist-django-extensions \
python311-django-extensions \
python3dist-django-extensions"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
