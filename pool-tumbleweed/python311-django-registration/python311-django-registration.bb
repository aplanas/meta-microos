SUMMARY = "An extensible user-registration application for Django"
DESCRIPTION = "This is a user registration application for Django. It requires a \
functional installation of Django, but has no other \
dependencies."
LICENSE = "BSD-3-Clause"

PV = "3.3"

RPM_NAME = "python311-django-registration-3.3-1.5.noarch.rpm"
RPM_HASH = "b079f5c3bd6c83a581bc17c9ce9f18be52db0941ddc0a2df239b829e7c208eac47d2c5c7804a29567e1df503c5eac881447b2c3b25e8c678a8c1923b02cb80da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-registration \
python3.11dist-django-registration \
python311-django-registration \
python3dist-django-registration"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-confusable-homoglyphs"

inherit rpm
