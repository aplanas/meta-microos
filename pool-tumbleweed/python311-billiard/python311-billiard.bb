SUMMARY = "Python multiprocessing fork"
DESCRIPTION = "billiard is a fork of the Python 2.7 multiprocessing package. The \
multiprocessing package itself is a renamed and updated version of \
R. Oudkerk's pyprocessing package. This standalone variant is \
compatible with Python 2.4 and 2.5, and will draw its \
fixes/improvements from python-trunk."
LICENSE = "BSD-3-Clause"

PV = "4.1.0"

RPM_NAME = "python311-billiard-4.1.0-2.3.noarch.rpm"
RPM_HASH = "87ea5972c324843613e237805c5d32c87fd2436d742a418c61a5b08e9bca3ab67ca9630d398ac224bc91193ca099d21bb89d5a590fa91da735c5f198efcc72bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-billiard \
python3.11dist-billiard \
python311-billiard \
python3dist-billiard"

RDEPENDS:${PN} += "python-abi"

inherit rpm
