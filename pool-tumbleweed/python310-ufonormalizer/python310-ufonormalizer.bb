SUMMARY = "Script to normalize the XML and other data inside of a UFO"
DESCRIPTION = "Script to normalize the XML and other data inside of a UFO."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "python310-ufonormalizer-0.6.1-1.7.noarch.rpm"
RPM_HASH = "3ef7cdf621a3812bae842dc7082db7d93efec382ec7819791a4202894fccc607c7758307581a167f5684a45a7e63c862e1bd04c1621ce930954f8d27890e05c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ufonormalizer \
python3.10dist-ufonormalizer \
python310-ufonormalizer \
python3dist-ufonormalizer"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
