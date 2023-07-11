SUMMARY = "Routines for dealing with data streams"
DESCRIPTION = "Routines for handling streaming data, including a set of generators \
for loading gzip data on the fly."
LICENSE = "MIT"

PV = "3.0.3"

RPM_NAME = "python39-jaraco.stream-3.0.3-2.2.noarch.rpm"
RPM_HASH = "db1962dff764257bb3882f635b049dd2c594bb778231ad9cea794dbb5cc970b0440313ad623662f5188884c7df1a77824727598f88ed45052ddc19d1dd2653e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jaraco.stream \
python39-jaraco.stream \
python3dist-jaraco.stream"

RDEPENDS:${PN} += "python-abi \
python39-more-itertools"

inherit rpm
