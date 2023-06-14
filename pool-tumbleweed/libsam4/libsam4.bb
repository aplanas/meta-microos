SUMMARY = "Corosync Simple Availability Manager API"
DESCRIPTION = "The SAM library provide a tool to check the health of an application. \
The main purpose of SAM is to restart a local process when it fails \
to respond to a healthcheck request in a configured time interval."
LICENSE = "BSD-3-Clause"

PV = "2.4.6"

RPM_NAME = "libsam4-2.4.6-1.3.aarch64.rpm"
RPM_HASH = "d77545ca0aa4a330825a27f328e70802247bab8e26cc65f1a64bb8379b32349ac01949d6d9a4d33b6d4b600a24f348f04bb230b712a9946d9ce60b283b4eff86"

RPROVIDES:${PN} += "libsam.so.4 \
libsam4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcmap.so.4 \
libquorum.so.5"

inherit rpm
