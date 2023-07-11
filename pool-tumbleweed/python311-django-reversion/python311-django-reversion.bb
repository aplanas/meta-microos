SUMMARY = "A Django extension that provides version control for model instances"
DESCRIPTION = "Django-reversion is an extension to the Django web framework that provides \
version control for model instances. \
 \
-  Roll back to any point in a model instance's history. \
-  Recover deleted model instances. \
-  Simple admin integration."
LICENSE = "BSD-3-Clause"

PV = "5.0.4"

RPM_NAME = "python311-django-reversion-5.0.4-1.5.noarch.rpm"
RPM_HASH = "c14a3b3661807eb4949a6d494b597f9cbb9bc154cb5506a10d1036564b6044bf66a1674dc32e4061d005624c61ed465d84ac4d0cb1e92279cdc9606ec504ab52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-reversion \
python3.11dist-django-reversion \
python311-django-reversion \
python3dist-django-reversion"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
