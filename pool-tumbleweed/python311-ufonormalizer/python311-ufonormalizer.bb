SUMMARY = "Script to normalize the XML and other data inside of a UFO"
DESCRIPTION = "Script to normalize the XML and other data inside of a UFO."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "python311-ufonormalizer-0.6.1-1.7.noarch.rpm"
RPM_HASH = "89d6005852d29c9ae1d2fa9f245596e62d16c5a4227d91a28731983d08d33657d4553ff58010da1e2c052343739e7a67abe949d88742bc3ac6719762ef823e80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-ufonormalizer \
python311-ufonormalizer \
python3dist-ufonormalizer"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
