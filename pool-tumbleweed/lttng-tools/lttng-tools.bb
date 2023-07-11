SUMMARY = "Linux Trace Toolkit Next Generation userspace tools"
DESCRIPTION = "This package provides the userspace tools for controlling the LTTng \
subsystem from userspace."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "2.13.9"

RPM_NAME = "lttng-tools-2.13.9-1.5.aarch64.rpm"
RPM_HASH = "61a9ee51ecc1b36ae893d903419a0a15cf430dc0a7cf8b52c2c7a63b2cd043175c915a3a59fc3fe470d468031e214cca34f174dcd9bfee108ed1e5fe6fb6089c"

RPROVIDES:${PN} += "lttng-tools"

RDEPENDS:${PN} += "babeltrace \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblttng-ctl.so.0 \
liblttng-ust-common.so.1 \
liblttng-ust-ctl.so.5 \
libpopt.so.0 \
liburcu-cds.so.8 \
liburcu-common.so.8 \
liburcu.so.8 \
libxml2.so.2"

inherit rpm
