SUMMARY = "Polymorphic inheritance for Django models"
DESCRIPTION = "Seamless polymorphic inheritance for Django models."
LICENSE = "BSD-3-Clause"

PV = "3.1"

RPM_NAME = "python310-django-polymorphic-3.1-2.6.noarch.rpm"
RPM_HASH = "54fe335a533d6699fe2b7d6aebee9bd6c66e3a86d140162f30d55728532eb9f5bb3f91d8dfc6136e486806b5a5a24b543c3fa4d72fd3df6d8e05c3ce9b2aa048"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-polymorphic \
python3.10dist(django-polymorphic) \
python310-django-polymorphic \
python3dist(django-polymorphic)"

RDEPENDS:${PN} += "python(abi) \
python310-Django"

inherit rpm
