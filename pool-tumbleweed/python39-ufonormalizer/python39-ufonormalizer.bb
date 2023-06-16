SUMMARY = "Script to normalize the XML and other data inside of a UFO"
DESCRIPTION = "Script to normalize the XML and other data inside of a UFO."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "python39-ufonormalizer-0.6.1-1.7.noarch.rpm"
RPM_HASH = "fa656f6d310afb9dd44b2c584b99bd48d909bb62c55338612571ccccfdc0fd76c02e5c5e8d508a40bf716dadb49d13b3f29c7e894a09c0fa8d6cf7f6fcae1997"
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
