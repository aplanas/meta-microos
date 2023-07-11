SUMMARY = "Django ORM cache with automatic granular event-driven invalidation"
DESCRIPTION = "A slick app that supports automatic or manual queryset caching and automatic \
granular event-driven invalidation. \
 \
It uses `redis <http://redis.io/>`_ as backend for ORM cache and redis or \
filesystem for simple time-invalidated one."
LICENSE = "BSD-3-Clause"

PV = "7.0.1"

RPM_NAME = "python310-django-cacheops-7.0.1-1.3.noarch.rpm"
RPM_HASH = "9917a0d30f7cd5b8a4a9f56f7788f5e5789e39753735a41c15aa8a4aa566b3fd72165997992416e8587ab37b3049d85c34d41a78ed0c1faaf5d5b52c44132882"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-cacheops \
python310-django-cacheops \
python3dist-django-cacheops"

RDEPENDS:${PN} += "python-abi \
python310-django \
python310-funcy \
python310-redis"

inherit rpm
