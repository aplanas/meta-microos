SUMMARY = "Python module for Digital Ocean droplets"
DESCRIPTION = "Python module to manage Digital Ocean droplets."
LICENSE = "LGPL-3.0-only"

PV = "1.17.0"

RPM_NAME = "python310-digitalocean-1.17.0-2.1.noarch.rpm"
RPM_HASH = "295a2e12580a769998e8452c4ee884c58f449670c60a1ad16e2c53b8c39bac7fe358be3a5169e8e54386d6eef6babeb13b2db29111397300dcd47dd67416608e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-digitalocean \
python310-digitalocean \
python3dist-python-digitalocean"

RDEPENDS:${PN} += "python-abi \
python310-jsonpickle \
python310-pytest \
python310-requests \
python310-responses"

inherit rpm
