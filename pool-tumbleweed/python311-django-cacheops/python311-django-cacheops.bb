SUMMARY = "Django ORM cache with automatic granular event-driven invalidation"
DESCRIPTION = "A slick app that supports automatic or manual queryset caching and automatic \
granular event-driven invalidation. \
 \
It uses `redis <http://redis.io/>`_ as backend for ORM cache and redis or \
filesystem for simple time-invalidated one."
LICENSE = "BSD-3-Clause"

PV = "7.0.1"

RPM_NAME = "python311-django-cacheops-7.0.1-1.1.noarch.rpm"
RPM_HASH = "90837745a79be4bf6c05c4ef6714adb28757fa132bbf29c1b1d5576a41bd241ad6b995294cca76434147b4d1043fac6683e048e4988eea2f3db321f0c7418430"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-django-cacheops \
python311-django-cacheops \
python3dist-django-cacheops"

RDEPENDS:${PN} += "python-abi \
python311-django \
python311-funcy \
python311-redis"

inherit rpm
