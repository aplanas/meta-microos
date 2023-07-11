SUMMARY = "Django application configuration via environment variables"
DESCRIPTION = "Django-environ allows utilizing 12factor inspired environment \
variables to configure Django applications."
LICENSE = "MIT"

PV = "0.4.5"

RPM_NAME = "python310-django-environ-0.4.5-5.1.noarch.rpm"
RPM_HASH = "c34c0b96a6a26708b89a0080c29425f5cab21568b0d7be01bdc64cd12574e208474462e93aa2cc8025bb8e6bafb927e13b320c5217d4f2cb2a0482ff44f4a88a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-environ \
python310-django-environ \
python3dist-django-environ"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
