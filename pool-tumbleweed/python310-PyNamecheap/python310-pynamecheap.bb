SUMMARY = "Namecheap API client in Python"
DESCRIPTION = "Namecheap API client in Python"
LICENSE = "MIT"

PV = "0.0.3"

RPM_NAME = "python310-PyNamecheap-0.0.3-2.16.noarch.rpm"
RPM_HASH = "921cb52bfec8bbd93b3771567a409a53e446694b24f2d90e9f408e38b6c244e50f356a76042e7730790fefb952f81b100507cf85ec4c5be43cfe0d6d1fce7815"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pynamecheap \
python310-PyNamecheap \
python3dist-pynamecheap"

RDEPENDS:${PN} += "python-abi \
python310-requests"

inherit rpm
