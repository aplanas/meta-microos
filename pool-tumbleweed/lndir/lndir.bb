SUMMARY = "Utility to create a shadow directory of symbolic links to another directory tree"
DESCRIPTION = "The lndir program makes a shadow copy of a directory tree, except that \
the shadow is not populated with real files but instead with symbolic \
links pointing at the real files in the original directory tree."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "lndir-1.0.4-1.2.aarch64.rpm"
RPM_HASH = "15f0047b13a1b92a652bf04a100770eabe962412501024bc0c0ad671083259c0c5668671d04adda1f2c8173ac3940583642852dae0f23953fea3889303cae0c9"

RPROVIDES:${PN} += "lndir \
lndir(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
