SUMMARY = "VAPID header generation library"
DESCRIPTION = "VAPID header generation library."
LICENSE = "MPL-2.0"

PV = "1.9.0"

RPM_NAME = "python39-py-vapid-1.9.0-1.4.noarch.rpm"
RPM_HASH = "fea2aa8e99e501e777d8744c3da4ea1d96ad8d23b5923464e0d4e42c14edd143ba58ecc47afda2629a80ddd2147a232ab00e3898ebc06a2cfa714e16815d53e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-py-vapid \
python39-py-vapid \
python3dist-py-vapid"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-cryptography \
update-alternatives"

inherit rpm
