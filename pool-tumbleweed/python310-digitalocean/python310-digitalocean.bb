SUMMARY = "Python module for Digital Ocean droplets"
DESCRIPTION = "Python module to manage Digital Ocean droplets."
LICENSE = "LGPL-3.0-only"

PV = "1.17.0"

RPM_NAME = "python310-digitalocean-1.17.0-1.7.noarch.rpm"
RPM_HASH = "a325487d734fa95ee1678fd5a593970662f0b6df23f9158a244bf83ebc34cd91bc8e1b72c865077324e2c19424d6ea39f41bfa2d8c4dd2d94f17f63069d2a543"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-digitalocean \
python3.10dist(python-digitalocean) \
python310-digitalocean \
python3dist(python-digitalocean)"
RDEPENDS:${PN} += "python(abi) \
python310-jsonpickle \
python310-pytest \
python310-requests \
python310-responses"

inherit rpm
