SUMMARY = "Python3 bindings for libproxy"
DESCRIPTION = "libproxy is a library that provides automatic proxy configuration \
management. \
 \
This package contains the Python 3 bindings for libproxy."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.18"

RPM_NAME = "python3-libproxy-0.4.18-2.4.noarch.rpm"
RPM_HASH = "c4c072cc2bb3070253fdb1d4d655141a2e46c44681a9d50272efb56596837a5874ec6ce152863bf3c93a01ff90af60474da922493c5e3e7962eb981d2319c5d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-libproxy"

RDEPENDS:${PN} += "libproxy1 \
python-abi"

inherit rpm
