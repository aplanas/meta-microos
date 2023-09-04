SUMMARY = "Development files for python310-pyzmq"
DESCRIPTION = "Development libraries and headers needed to build software using python310-pyzmq."
LICENSE = "BSD-3-Clause & LGPL-3.0-or-later"

PV = "25.1.1"

RPM_NAME = "python310-pyzmq-devel-25.1.1-1.1.aarch64.rpm"
RPM_HASH = "8d9063936987a135978f1a1c04ce73cea82931ed66c13f3f2d7d6ed7057883962e9d157eb2febca4bc76f3b24f41633e967757438067b2c95337337f1aebaa58"

RPROVIDES:${PN} += "python310-pyzmq-devel"

RDEPENDS:${PN} += "python-abi \
python310-devel \
python310-pyzmq \
zeromq-devel"

inherit rpm
