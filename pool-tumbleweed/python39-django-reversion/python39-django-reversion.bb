SUMMARY = "A Django extension that provides version control for model instances"
DESCRIPTION = "Django-reversion is an extension to the Django web framework that provides \
version control for model instances. \
 \
-  Roll back to any point in a model instance's history. \
-  Recover deleted model instances. \
-  Simple admin integration."
LICENSE = "BSD-3-Clause"

PV = "5.0.4"

RPM_NAME = "python39-django-reversion-5.0.4-1.3.noarch.rpm"
RPM_HASH = "97bea2d838b36146d4635806832939cebb0db138a5c4c9d689863000dfc155873a9207c52346ac345a325283150bc88ff37bf6bdc5cc8f7811c650a17085e581"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-reversion) \
python39-django-reversion \
python3dist(django-reversion)"

RDEPENDS:${PN} += "python(abi) \
python39-Django"

inherit rpm
