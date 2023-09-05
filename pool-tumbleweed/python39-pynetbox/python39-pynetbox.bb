SUMMARY = "NetBox API client library"
DESCRIPTION = "Python API client library for NetBox."
LICENSE = "Apache-2.0"

PV = "7.1.0"

RPM_NAME = "python39-pynetbox-7.1.0-1.1.noarch.rpm"
RPM_HASH = "5eb4869c1422a0f05858d2ed8305ff8a56ece953fb959d973b36368dee10c9be75ac6b4bdde339581013ec97c476330059ed1eca8f176ece3210fa5418e47edc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pynetbox \
python39-pynetbox \
python3dist-pynetbox"

RDEPENDS:${PN} += "python-abi \
python39-packaging \
python39-requests"

inherit rpm
