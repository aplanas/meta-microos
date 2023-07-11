SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains development libraries for libscotch."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "scotch_6_1_0-gnu-hpc-devel-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "9a7fdbbc09867dd37a40216bb13be0c0684a9ddf112fc2b4b4514dba5dfcd6fe5d890871cd060e18822cb0e894788eba290c6d12c3ee57ad5b5f53f032d393d4"

RPROVIDES:${PN} += "scotch-6-1-0-gnu-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgfortran.so.5 \
libm.so.6 \
libscotch-6-1-0-gnu-hpc \
libz.so.1"

inherit rpm
