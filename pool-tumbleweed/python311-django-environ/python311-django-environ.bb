SUMMARY = "Django application configuration via environment variables"
DESCRIPTION = "Django-environ allows utilizing 12factor inspired environment \
variables to configure Django applications."
LICENSE = "MIT"

PV = "0.4.5"

RPM_NAME = "python311-django-environ-0.4.5-5.1.noarch.rpm"
RPM_HASH = "b3a1efd217556329eba0ca296f5d95876f874570bbd92804593dcad27b28d1f8e1e410483b60a94d49b51f7ff5da599c60ff3130c3edc3a72dafe20c83b32b9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-environ \
python3.11dist-django-environ \
python311-django-environ \
python3dist-django-environ"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
