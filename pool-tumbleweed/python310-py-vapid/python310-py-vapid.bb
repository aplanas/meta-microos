SUMMARY = "VAPID header generation library"
DESCRIPTION = "VAPID header generation library."
LICENSE = "MPL-2.0"

PV = "1.9.0"

RPM_NAME = "python310-py-vapid-1.9.0-1.6.noarch.rpm"
RPM_HASH = "99e9148b8e7e97da923764f516202c23334ef887a283d298b43d3b728adbde08e54e120192f83cbac48c432e32a9d51620f4f42de11a8f4bb4f673433b31d9ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-py-vapid \
python310-py-vapid \
python3dist-py-vapid"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-cryptography \
update-alternatives"

inherit rpm
