SUMMARY = "Python module for Digital Ocean droplets"
DESCRIPTION = "Python module to manage Digital Ocean droplets."
LICENSE = "LGPL-3.0-only"

PV = "1.17.0"

RPM_NAME = "python311-digitalocean-1.17.0-1.7.noarch.rpm"
RPM_HASH = "eaad6584d23b83002057ac7595152a37c7e038b5482b87c3676f42941d48e5fd0abeb5d0005455f92b10f8adb6836fddffb714b69211c5eefe5bd9cde0f8db66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-digitalocean) \
python311-digitalocean \
python3dist(python-digitalocean)"
RDEPENDS:${PN} += "python(abi) \
python311-jsonpickle \
python311-pytest \
python311-requests \
python311-responses"

inherit rpm
