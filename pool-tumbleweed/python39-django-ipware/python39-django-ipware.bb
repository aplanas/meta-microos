SUMMARY = "Django utility application that returns client's real IP address"
DESCRIPTION = "A Django utility application that returns client's real IP address."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "python39-django-ipware-5.0.0-1.1.noarch.rpm"
RPM_HASH = "582af9c062bad201c7ffcbaf16f7acd133d0e7d01837a1fbed08e7d8fef45eac7a692c686454104c3874d900a9c3d30c9f5918af9fb5ed217d9f0680db5c4548"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-ipware \
python39-django-ipware \
python3dist-django-ipware"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
