SUMMARY = "Django application configuration via environment variables"
DESCRIPTION = "Django-environ allows utilizing 12factor inspired environment \
variables to configure Django applications."
LICENSE = "MIT"

PV = "0.4.5"

RPM_NAME = "python311-django-environ-0.4.5-4.8.noarch.rpm"
RPM_HASH = "4afab6a1b8955007691cd9bac027333a2ddcee09096f27b7e9f63ecac6053885da25640f2c432a4cab16ee38a8083a59b9269906d7279c3486cc1f3128c08999"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-django-environ \
python311-django-environ \
python3dist-django-environ"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
