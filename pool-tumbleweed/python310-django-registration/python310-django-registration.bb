SUMMARY = "An extensible user-registration application for Django"
DESCRIPTION = "This is a user registration application for Django. It requires a \
functional installation of Django, but has no other \
dependencies."
LICENSE = "BSD-3-Clause"

PV = "3.3"

RPM_NAME = "python310-django-registration-3.3-1.5.noarch.rpm"
RPM_HASH = "9f9dd4dda20529d09d2b989f85f9949ea61aabce6ecd4dc53483c58bcfa16525b17bee57342bf2430e0acf765c0d50ab61d12083a8cba915b586cb632c6fc2cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-registration \
python310-django-registration \
python3dist-django-registration"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-confusable-homoglyphs"

inherit rpm
