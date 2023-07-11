SUMMARY = "A Combined Serial and Network Communication Software Package"
DESCRIPTION = "C-Kermit is a combined serial and network communication software \
package offering a consistent, medium-independent, and cross-platform \
approach to connection establishment, terminal sessions, file transfer, \
character-set translation, and automation of communication tasks."
LICENSE = "BSD-3-Clause"

PV = "9.0.302"

RPM_NAME = "ckermit-9.0.302-14.18.aarch64.rpm"
RPM_HASH = "44c7bfe2b61b71f0ce3fc89705860479455cdd06ac5ca5e35758f7a8df79ee64ed86d449ed07dca4a1f4b81d91a5a4572c494afcb73395dc3542f5b90b2041df"

RPROVIDES:${PN} += "ckermit \
kermit"

RDEPENDS:${PN} += "libc.so.6 \
libcrypt.so.1 \
liblockdev.so.1 \
libm.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
