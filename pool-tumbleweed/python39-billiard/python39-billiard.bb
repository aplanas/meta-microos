SUMMARY = "Python multiprocessing fork"
DESCRIPTION = "billiard is a fork of the Python 2.7 multiprocessing package. The \
multiprocessing package itself is a renamed and updated version of \
R. Oudkerk's pyprocessing package. This standalone variant is \
compatible with Python 2.4 and 2.5, and will draw its \
fixes/improvements from python-trunk."
LICENSE = "BSD-3-Clause"

PV = "4.1.0"

RPM_NAME = "python39-billiard-4.1.0-2.3.noarch.rpm"
RPM_HASH = "6d592fa91613fd3097e61cc6f92fd44a9513efcaab561077deb55cf5b5e981e6639759d111fb8c0ddaa58695a529f51fe2c481c20f238ff51339e86e26924de6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-billiard \
python39-billiard \
python3dist-billiard"

RDEPENDS:${PN} += "python-abi"

inherit rpm
