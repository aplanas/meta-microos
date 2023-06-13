SUMMARY = "Utilities from libqb, an IPC library"
DESCRIPTION = "libqb is a library providing high performance client server reusable \
features. It provides logging, tracing, IPC, and polling."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.6+20220323.758044b"

RPM_NAME = "libqb-tools-2.0.6+20220323.758044b-1.3.aarch64.rpm"
RPM_HASH = "0ffddae41db6999addaeb39f21ed689aadaaef80b111b1cc7ce4cf30ff112664750b8b3ebb720875d44633cbe440bbbbc839397ef85d2c8fa7de75d0e4ce52e6"

RPROVIDES:${PN} += "libqb-tools \
libqb-tools(aarch-64) \
libqb0:/usr/sbin/qb-blackbox"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libqb.so.100()(64bit)"

inherit rpm
