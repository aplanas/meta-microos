SUMMARY = "Gravatar Support for Django"
DESCRIPTION = "Essential Gravatar support for Django. Features helper methods, templatetags and a full test suite!"
LICENSE = "MIT"

PV = "1.4.4"

RPM_NAME = "python310-django-gravatar2-1.4.4-3.1.noarch.rpm"
RPM_HASH = "5e78f6cc056f393fc9094b77c3694697a320215604c39513238cb735c46e441ff6994a007faffe74333a0ce282bbddbb4e08842feb3033cb08df8b4ddd1f84f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-gravatar2 \
python310-django-gravatar2 \
python3dist-django-gravatar2"

RDEPENDS:${PN} += "python-abi"

inherit rpm
