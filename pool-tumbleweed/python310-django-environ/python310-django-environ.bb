SUMMARY = "Django application configuration via environment variables"
DESCRIPTION = "Django-environ allows utilizing 12factor inspired environment \
variables to configure Django applications."
LICENSE = "MIT"

PV = "0.4.5"

RPM_NAME = "python310-django-environ-0.4.5-4.8.noarch.rpm"
RPM_HASH = "ad4d44a364fc9cd5c7d3d90e4ccd27d0d31e2f32567d789f0f9043dcbcace4d4e8b05341f5c39ac6aa6e414c3c083c22078f1a964b1a190664368b8cbd047558"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-environ \
python3.10dist(django-environ) \
python310-django-environ \
python3dist(django-environ)"

RDEPENDS:${PN} += "python(abi) \
python310-Django"

inherit rpm
