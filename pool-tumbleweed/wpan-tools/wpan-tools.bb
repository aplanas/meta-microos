SUMMARY = "Utilities to manage the Linux 802.15.4 WPAN stack"
DESCRIPTION = "This is a set of utils to manage the Linux WPAN stack, \
compatible with IEEE 802.15.4-2003 (and to a lesser extent, \
2006)."
LICENSE = "ISC"

PV = "0.9"

RPM_NAME = "wpan-tools-0.9-1.14.aarch64.rpm"
RPM_HASH = "77781759181dd8c39cf6db718f650aa0907f676ceb4ebdf4f3d2a4f3dc872ee12dcffe1f95a3d62bfd09505fcd620eee3a1d1faf1b17086adcfeb198701def9b"

RPROVIDES:${PN} += "wpan-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnl-3.so.200 \
libnl-genl-3.so.200"

inherit rpm
