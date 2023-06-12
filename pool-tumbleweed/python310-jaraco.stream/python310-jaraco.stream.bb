SUMMARY = "Routines for dealing with data streams"
DESCRIPTION = "Routines for handling streaming data, including a set of generators \
for loading gzip data on the fly."
LICENSE = "MIT"

PV = "3.0.3"

RPM_NAME = "python310-jaraco.stream-3.0.3-2.1.noarch.rpm"
RPM_HASH = "f6dac51c934dbc67eaadf8b163ab2c74e0470eb3e90a1c96d9b35064b164fbf1cea3ede2481325358c6218085e3a6f6f6c175ecbd53d284586964bbed8c493da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.stream \
python3.10dist(jaraco.stream) \
python310-jaraco.stream \
python3dist(jaraco.stream)"
RDEPENDS:${PN} += "python(abi) \
python310-more-itertools"

inherit rpm
