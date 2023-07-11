SUMMARY = "Routines for dealing with data streams"
DESCRIPTION = "Routines for handling streaming data, including a set of generators \
for loading gzip data on the fly."
LICENSE = "MIT"

PV = "3.0.3"

RPM_NAME = "python311-jaraco.stream-3.0.3-2.2.noarch.rpm"
RPM_HASH = "14da83b9d0179d0355537f76052a56c0651204f8db18001fab2d72d08f3aec7231fd09eb00e2fce38037fb1df5c81d232611b813b40f38f4bedc216963297072"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.stream \
python3.11dist-jaraco.stream \
python311-jaraco.stream \
python3dist-jaraco.stream"

RDEPENDS:${PN} += "python-abi \
python311-more-itertools"

inherit rpm
