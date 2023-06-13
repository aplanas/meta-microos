SUMMARY = "Rect class for Pygame-like rectangular areas"
DESCRIPTION = "PyRect is a simple module with a Rect class for Pygame-like rectangular areas."
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "python39-PyRect-0.2.0-1.3.noarch.rpm"
RPM_HASH = "fc8dbb762d94feea486b3c601b6c26301d5853c48b1c4f0bb4c99d77ccef460e846827a707cd4e8bfab6b9d0a8d691a4819b09653882a14b637daeb4efe70d2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyrect) \
python39-PyRect \
python3dist(pyrect)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
