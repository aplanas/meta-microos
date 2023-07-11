SUMMARY = "Python multiprocessing fork"
DESCRIPTION = "billiard is a fork of the Python 2.7 multiprocessing package. The \
multiprocessing package itself is a renamed and updated version of \
R. Oudkerk's pyprocessing package. This standalone variant is \
compatible with Python 2.4 and 2.5, and will draw its \
fixes/improvements from python-trunk."
LICENSE = "BSD-3-Clause"

PV = "4.1.0"

RPM_NAME = "python310-billiard-4.1.0-2.3.noarch.rpm"
RPM_HASH = "684639da36bcdfc67d80e181aeae4c18c9c4e8b1f518b5f88e996952d9f111a9cfeb111c96cbd7b11b7812bb10d587cd99be350c76e13bacdc1fae1799d49fdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-billiard \
python310-billiard \
python3dist-billiard"

RDEPENDS:${PN} += "python-abi"

inherit rpm
