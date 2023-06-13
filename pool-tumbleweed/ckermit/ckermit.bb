SUMMARY = "A Combined Serial and Network Communication Software Package"
DESCRIPTION = "C-Kermit is a combined serial and network communication software \
package offering a consistent, medium-independent, and cross-platform \
approach to connection establishment, terminal sessions, file transfer, \
character-set translation, and automation of communication tasks."
LICENSE = "BSD-3-Clause"

PV = "9.0.302"

RPM_NAME = "ckermit-9.0.302-14.17.aarch64.rpm"
RPM_HASH = "24c04b6a7dd817279136b8603e6a3f2ce7ef26350839fb8c63f7eaac3395adaf2b8fb56091964835b9bbd88df784ade5acf2322c3d3cbbae8eda50ed017eab92"

RPROVIDES:${PN} += "ckermit \
ckermit(aarch-64) \
kermit"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libcrypt.so.1()(64bit) \
liblockdev.so.1()(64bit) \
libm.so.6()(64bit) \
libncurses.so.6()(64bit) \
libtinfo.so.6()(64bit)"

inherit rpm
