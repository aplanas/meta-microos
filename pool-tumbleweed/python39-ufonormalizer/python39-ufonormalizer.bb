SUMMARY = "Script to normalize the XML and other data inside of a UFO"
DESCRIPTION = "Script to normalize the XML and other data inside of a UFO."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "python39-ufonormalizer-0.6.1-1.9.noarch.rpm"
RPM_HASH = "28e80c2cad0460f9c89fd54f03aadcd9388c6406d45680ec08d116c831ea4826eba28632645972c206e968f082e5477f87d3fc2a9505ffb60e533b1ed876ab91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ufonormalizer \
python39-ufonormalizer \
python3dist-ufonormalizer"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
