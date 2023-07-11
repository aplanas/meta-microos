SUMMARY = "An extensible user-registration application for Django"
DESCRIPTION = "This is a user registration application for Django. It requires a \
functional installation of Django, but has no other \
dependencies."
LICENSE = "BSD-3-Clause"

PV = "3.3"

RPM_NAME = "python39-django-registration-3.3-1.5.noarch.rpm"
RPM_HASH = "685d51e05cf10d6155294c3cd85bbff4356b0f9ac178a3444011ee78f001a2dfc4698c7c8d52495689dd9aee928cd6b97c15653d6abf18dd2cf908227a15762d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-registration \
python39-django-registration \
python3dist-django-registration"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-confusable-homoglyphs"

inherit rpm
