SUMMARY = "A redis cache backend for Django"
DESCRIPTION = "A redis cache backend for Django."
LICENSE = "BSD-3-Clause"

PV = "5.3.0"

RPM_NAME = "python310-django-redis-5.3.0-1.1.noarch.rpm"
RPM_HASH = "b038a82445017490650aacb2f45003778fa842b99f3dbf9d8561be81534d894eb92fa2839db2c6a4979a7592ac57f8f4b7f9850b44d1175062acc27515369092"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-redis \
python310-django-redis \
python3dist-django-redis"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-lz4 \
python310-msgpack \
python310-redis"

inherit rpm
