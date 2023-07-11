SUMMARY = "Script to normalize the XML and other data inside of a UFO"
DESCRIPTION = "Script to normalize the XML and other data inside of a UFO."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "python310-ufonormalizer-0.6.1-1.9.noarch.rpm"
RPM_HASH = "f7ffd8b94c7fcdf8d295544da4f4500e83619caf30d4611067c531a66c715406a81f8b7e3969d6f407ef55948d18081444f7dd459764e74de14128947e002f38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ufonormalizer \
python310-ufonormalizer \
python3dist-ufonormalizer"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
