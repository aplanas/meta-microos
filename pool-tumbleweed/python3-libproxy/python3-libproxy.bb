SUMMARY = "Python3 bindings for libproxy"
DESCRIPTION = "libproxy is a library that provides automatic proxy configuration \
management. \
 \
This package contains the Python 3 bindings for libproxy."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.18"

RPM_NAME = "python3-libproxy-0.4.18-2.3.noarch.rpm"
RPM_HASH = "395d87aee988411a30014eb2cab82c9e8d8c39cfeb185417a2a29edd31defd7f8e4a1b9e75a724dbf3bfe4cad673518e60f119204a870d723dabf4b9a5f3dd2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-libproxy"

RDEPENDS:${PN} += "libproxy1 \
python-abi"

inherit rpm
