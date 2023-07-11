SUMMARY = "Django ORM cache with automatic granular event-driven invalidation"
DESCRIPTION = "A slick app that supports automatic or manual queryset caching and automatic \
granular event-driven invalidation. \
 \
It uses `redis <http://redis.io/>`_ as backend for ORM cache and redis or \
filesystem for simple time-invalidated one."
LICENSE = "BSD-3-Clause"

PV = "7.0.1"

RPM_NAME = "python311-django-cacheops-7.0.1-1.3.noarch.rpm"
RPM_HASH = "8deff8de93168dc49c48925fc2c80e8bbb539665c002f8b302c4ac7a2f295b0911523c20e7c6dcdbbfd004117ee71a582bd7ed1cd84aebbbe7ba3c66ac5dde77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-cacheops \
python3.11dist-django-cacheops \
python311-django-cacheops \
python3dist-django-cacheops"

RDEPENDS:${PN} += "python-abi \
python311-django \
python311-funcy \
python311-redis"

inherit rpm
