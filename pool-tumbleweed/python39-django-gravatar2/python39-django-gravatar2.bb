SUMMARY = "Gravatar Support for Django"
DESCRIPTION = "Essential Gravatar support for Django. Features helper methods, templatetags and a full test suite!"
LICENSE = "MIT"

PV = "1.4.4"

RPM_NAME = "python39-django-gravatar2-1.4.4-3.1.noarch.rpm"
RPM_HASH = "561301cbac13485711f5d7ffd9aae7c0998b718aa9592f138994138e8651678437ec869ebd938638dbb4a16db118956f38cd25d95e42b8351497370962d82f15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-gravatar2 \
python39-django-gravatar2 \
python3dist-django-gravatar2"

RDEPENDS:${PN} += "python-abi"

inherit rpm
