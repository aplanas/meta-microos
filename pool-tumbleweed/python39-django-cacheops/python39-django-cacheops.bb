SUMMARY = "Django ORM cache with automatic granular event-driven invalidation"
DESCRIPTION = "A slick app that supports automatic or manual queryset caching and automatic \
granular event-driven invalidation. \
 \
It uses `redis <http://redis.io/>`_ as backend for ORM cache and redis or \
filesystem for simple time-invalidated one."
LICENSE = "BSD-3-Clause"

PV = "7.0.1"

RPM_NAME = "python39-django-cacheops-7.0.1-1.3.noarch.rpm"
RPM_HASH = "a2cdd1ed1ee3e843d6e32e81100147ca6ee765956f04a3749e4608655e85942f1bf2e546fba9814f375259842a7d6277ce1417b4e483f925fe4515b1094acba5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-cacheops \
python39-django-cacheops \
python3dist-django-cacheops"

RDEPENDS:${PN} += "python-abi \
python39-django \
python39-funcy \
python39-redis"

inherit rpm
