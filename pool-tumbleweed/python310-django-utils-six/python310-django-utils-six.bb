SUMMARY = "Forward compatibility django.utils.six for Django 3"
DESCRIPTION = "Forward compatibility django.utils.six for Django 3."
LICENSE = "BSD-3-Clause"

PV = "2.0"

RPM_NAME = "python310-django-utils-six-2.0-1.11.noarch.rpm"
RPM_HASH = "973f69ce262d5e2d753ebadc0325e096e7c6f83691eabaf351307fbd174bd2fce289ece4cc3d3962b6b419d3521638a1609a415f370a8878f5a70eb9dd36d979"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-utils-six \
python3.10dist(django-utils-six) \
python310-django-utils-six \
python3dist(django-utils-six)"

RDEPENDS:${PN} += "python(abi) \
python310-Django"

inherit rpm
