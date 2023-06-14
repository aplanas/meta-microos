SUMMARY = "A redis cache backend for Django"
DESCRIPTION = "A redis cache backend for Django."
LICENSE = "BSD-3-Clause"

PV = "5.2.0"

RPM_NAME = "python310-django-redis-5.2.0-1.4.noarch.rpm"
RPM_HASH = "58d1db2e726c6e055d36e86a56a4f2ce711c3bd370e11666b9e2266dd04623c24e49e9c3b7ca35132d28850b2b8dbad00504785888bb3a68ac2ea98487a40d2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-redis \
python3.10dist-django-redis \
python310-django-redis \
python3dist-django-redis"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-lz4 \
python310-msgpack \
python310-redis"

inherit rpm
