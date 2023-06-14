SUMMARY = "Python3 bindings for libproxy"
DESCRIPTION = "libproxy is a library that provides automatic proxy configuration \
management. \
 \
This package contains the Python 3 bindings for libproxy."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.18"

RPM_NAME = "python3-libproxy-0.4.18-2.1.noarch.rpm"
RPM_HASH = "61db66d5b96acfafadf1d3fd0d538f91b6f2ae9d291148ce0c6f1ba82d42280a9d4a6a7ac0ed78000935838ef14213f51949efc9f0038c7512f5fadb4d8b60b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-libproxy"

RDEPENDS:${PN} += "libproxy1 \
python-abi"

inherit rpm
