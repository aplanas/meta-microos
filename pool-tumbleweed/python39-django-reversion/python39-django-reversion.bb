SUMMARY = "A Django extension that provides version control for model instances"
DESCRIPTION = "Django-reversion is an extension to the Django web framework that provides \
version control for model instances. \
 \
-  Roll back to any point in a model instance's history. \
-  Recover deleted model instances. \
-  Simple admin integration."
LICENSE = "BSD-3-Clause"

PV = "5.0.4"

RPM_NAME = "python39-django-reversion-5.0.4-1.5.noarch.rpm"
RPM_HASH = "0ee98f531f36a31e320f9357aeb0d274e88f785e3161a97225d5f61d7cf441eff221d3f491b53ec64aa4e8293fbc676b03c314c8734e310f4937ed794d7ff51a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-reversion \
python39-django-reversion \
python3dist-django-reversion"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
