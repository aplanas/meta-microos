SUMMARY = "Routines for dealing with data streams"
DESCRIPTION = "Routines for handling streaming data, including a set of generators \
for loading gzip data on the fly."
LICENSE = "MIT"

PV = "3.0.3"

RPM_NAME = "python310-jaraco.stream-3.0.3-2.2.noarch.rpm"
RPM_HASH = "d37f95b9711e5e37ad752487644a52934b2a2c729b7670c59bf8001f391a226583a49e66f793117a265512c71b2b82b674337e4686d5607f752487a396c1bec3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jaraco.stream \
python310-jaraco.stream \
python3dist-jaraco.stream"

RDEPENDS:${PN} += "python-abi \
python310-more-itertools"

inherit rpm
