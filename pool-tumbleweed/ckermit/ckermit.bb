SUMMARY = "A Combined Serial and Network Communication Software Package"
DESCRIPTION = "C-Kermit is a combined serial and network communication software \
package offering a consistent, medium-independent, and cross-platform \
approach to connection establishment, terminal sessions, file transfer, \
character-set translation, and automation of communication tasks."
LICENSE = "BSD-3-Clause"

PV = "9.0.302"

RPM_NAME = "ckermit-9.0.302-15.1.aarch64.rpm"
RPM_HASH = "9c874bdc7efe0b149d9283b30db4c03ef200a2ed36882c8a5a054627c7d68f5929ccebbacec7972d2eff465269f5c8473d4d16ecec874942a89c259965d8240f"

RPROVIDES:${PN} += "ckermit \
kermit"

RDEPENDS:${PN} += "libc.so.6 \
libcrypt.so.1 \
libm.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
