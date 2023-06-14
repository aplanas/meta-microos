SUMMARY = "Command-line utilities for IEC 61883 devices"
DESCRIPTION = "Utilities to inspect and control IEC 61883 hardware."
LICENSE = "GPL-2.0+ & LGPL-2.1+"

PV = "1.2.0"

RPM_NAME = "libiec61883-tools-1.2.0-8.26.aarch64.rpm"
RPM_HASH = "e6a17b8ffb8841cf9f8c4d45f635de505464dfc282b84ba200444eda2c878937bc018c1252c849e667acae08310f166f9c46c176b83c6586292a8040c395ac8d"

RPROVIDES:${PN} += "libiec61883 \
libiec61883-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libiec61883.so.0 \
libraw1394.so.11"

inherit rpm
