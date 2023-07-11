SUMMARY = "A redis cache backend for Django"
DESCRIPTION = "A redis cache backend for Django."
LICENSE = "BSD-3-Clause"

PV = "5.3.0"

RPM_NAME = "python311-django-redis-5.3.0-1.1.noarch.rpm"
RPM_HASH = "89a478b9450611222740f1826e75a72ae96782dbda0290f78b84946bdb8d201aeef301696d7a169583aa6cbdb4e019a4f79e2ba9db458e95e4e077e4b7c42d3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-redis \
python3.11dist-django-redis \
python311-django-redis \
python3dist-django-redis"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-lz4 \
python311-msgpack \
python311-redis"

inherit rpm
