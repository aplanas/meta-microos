SUMMARY = "A Django extension that provides version control for model instances"
DESCRIPTION = "Django-reversion is an extension to the Django web framework that provides \
version control for model instances. \
 \
-  Roll back to any point in a model instance's history. \
-  Recover deleted model instances. \
-  Simple admin integration."
LICENSE = "BSD-3-Clause"

PV = "5.0.4"

RPM_NAME = "python310-django-reversion-5.0.4-1.5.noarch.rpm"
RPM_HASH = "b33d09d69d9bdd9a3a3f5da98e75cb0930693d958ffaa8b7a2583f262b69dc6130d91071ed35fa1eb64ba1d942a6eed243bda981c66b64041351f1a5f36da245"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-reversion \
python310-django-reversion \
python3dist-django-reversion"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
