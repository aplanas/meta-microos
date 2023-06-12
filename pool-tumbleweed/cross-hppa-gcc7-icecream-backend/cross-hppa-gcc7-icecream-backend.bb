SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-hppa-gcc7-icecream-backend-7.5.0+r278197-14.1.aarch64.rpm"
RPM_HASH = "0eae435f32799da476f649344c1ae9761ba71bd8fc5be8324f5df3afff97bf6b12c6e65f44d7f92a64fa0d3258649b9da40a9d96c8ed7dce9f1efa0c6810f621"

RPROVIDES:${PN} += "cross-hppa-gcc7-icecream-backend \
cross-hppa-gcc7-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
