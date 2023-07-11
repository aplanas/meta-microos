SUMMARY = "A redis cache backend for Django"
DESCRIPTION = "A redis cache backend for Django."
LICENSE = "BSD-3-Clause"

PV = "5.3.0"

RPM_NAME = "python39-django-redis-5.3.0-1.1.noarch.rpm"
RPM_HASH = "3f8b4dd68d39eb83490f0f66eb70c5bf4a2eb7f9c91fd98acf6d6da16af7af498592cf719c817bbf57a9acdfea798b862bc07cb1fb88d2992e12401a5701741a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-redis \
python39-django-redis \
python3dist-django-redis"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-lz4 \
python39-msgpack \
python39-redis"

inherit rpm
