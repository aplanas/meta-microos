SUMMARY = "Django ORM cache with automatic granular event-driven invalidation"
DESCRIPTION = "A slick app that supports automatic or manual queryset caching and automatic \
granular event-driven invalidation. \
 \
It uses `redis <http://redis.io/>`_ as backend for ORM cache and redis or \
filesystem for simple time-invalidated one."
LICENSE = "BSD-3-Clause"

PV = "7.0.1"

RPM_NAME = "python39-django-cacheops-7.0.1-1.1.noarch.rpm"
RPM_HASH = "5ae8181b78ffe9351aecd2bae5f9cfb1759a5eb4a2e1806c5384ef8f84975dc2e7bb40ded998f997a5307b206d9881ed3e04217485a790b69a94d69e1b23f382"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-cacheops \
python39-django-cacheops \
python3dist-django-cacheops"

RDEPENDS:${PN} += "python-abi \
python39-django \
python39-funcy \
python39-redis"

inherit rpm
