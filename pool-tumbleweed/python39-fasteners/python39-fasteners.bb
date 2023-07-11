SUMMARY = "A python package that provides useful locks"
DESCRIPTION = "A python package that provides useful locks \
It includes the following. \
 * Locking decorator \
 * Reader-writer locks \
 * Inter-process locks \
 * Generic helpers"
LICENSE = "Apache-2.0"

PV = "0.17.3"

RPM_NAME = "python39-fasteners-0.17.3-1.6.noarch.rpm"
RPM_HASH = "653c790fdfcd1866ab832faa5876bad3c431b9e212f1ae00059ddc22913bf02e586b70bd3cf8e9baece4da7ec4713b5558cadaa69479cf1119631da255ab6dd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-fasteners \
python39-fasteners \
python3dist-fasteners"

RDEPENDS:${PN} += "python-abi \
python39-more-itertools \
python39-six"

inherit rpm
