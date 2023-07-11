SUMMARY = "A set of high-level abstractions for Django forms"
DESCRIPTION = "Django's 'formtools' is a set of high-level abstractions for Django forms. \
Currently for form previews and multi-step forms."
LICENSE = "BSD-3-Clause"

PV = "2.4.1"

RPM_NAME = "python39-django-formtools-2.4.1-1.3.noarch.rpm"
RPM_HASH = "b5f8c54150d79507590817fb1b335fae7dfc3eece9eebcce1728f9dd9f737aeefd8e5f5e3a6e8925dad675a5a4214ede8c4c5c86867fcaf1390ed3fbe47643c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-formtools \
python39-django-formtools \
python3dist-django-formtools"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
