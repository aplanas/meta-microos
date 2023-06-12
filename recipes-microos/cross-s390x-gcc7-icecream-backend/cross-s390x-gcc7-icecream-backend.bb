SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-s390x-gcc7-icecream-backend-7.5.0+r278197-14.1.aarch64.rpm"
RPM_HASH = "43d6a3b66bb7ffa1b1534bef1853cffa599201e23e86a493e8cf2cc1bfe620a9a4c1e8064b71c3affbb4429cc80ca7f8d6ff6e3e972aa1ae37b3fc287bdc5094"

RPROVIDES:${PN} += "cross-s390x-gcc7-icecream-backend \
cross-s390x-gcc7-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
