SUMMARY = "Jinja2 templating language integrated in Django"
DESCRIPTION = "Simple and nonobstructive jinja2 integration with Django."
LICENSE = "BSD-3-Clause"

PV = "2.10.2"

RPM_NAME = "python310-django-jinja-2.10.2-2.1.noarch.rpm"
RPM_HASH = "90d78c6b1c81167be9a2cab148edeb940b97e04faf6558b44d9f500ee376bb0c2311892ce7d33f1b1a97e0eb2b27e8061ec18ca2cf4ea26e8a66c455db97f9a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-jinja \
python310-django-jinja \
python3dist-django-jinja"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-Jinja2"

inherit rpm
