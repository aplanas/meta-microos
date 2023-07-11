SUMMARY = "Django application configuration via environment variables"
DESCRIPTION = "Django-environ allows utilizing 12factor inspired environment \
variables to configure Django applications."
LICENSE = "MIT"

PV = "0.4.5"

RPM_NAME = "python39-django-environ-0.4.5-5.1.noarch.rpm"
RPM_HASH = "e7def061b1ada418d90cfc4acd4e6fae20ab70e91f652cd8ded34d6307abb144945bb378d1a2415d759451fa68370cc84e17bf193ed69f149d9393f5a95c0763"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-environ \
python39-django-environ \
python3dist-django-environ"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
