SUMMARY = "Corosync Simple Availability Manager API"
DESCRIPTION = "The SAM library provide a tool to check the health of an application. \
The main purpose of SAM is to restart a local process when it fails \
to respond to a healthcheck request in a configured time interval."
LICENSE = "BSD-3-Clause"

PV = "2.4.6"

RPM_NAME = "libsam4-2.4.6-1.4.aarch64.rpm"
RPM_HASH = "895bc88f06e23dc75ed0a5379aa3071f706a95276c4d7578717fbc5ca086076340b3b672b983994b16c27306b83e4b83828f9e3e0f7a5bfbdb9ae65bb49d373b"

RPROVIDES:${PN} += "libsam.so.4 \
libsam4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcmap.so.4 \
libquorum.so.5"

inherit rpm
