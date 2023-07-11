SUMMARY = "Tools for libtracefs"
DESCRIPTION = "This library provides C APIs to access the kernel trace file system. \
 \
This subpackage contains tools."
LICENSE = "LGPL-2.1-only"

PV = "1.7.0"

RPM_NAME = "libtracefs-tools-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "28b6d98c583f576c1fbd4caf573af632f81bcb4cc2ae39ebf98f7b470374092d978deb5e8f5c0a131a0e20eaf6665b6be681888c51e0c9d7328458ea201783a8"

RPROVIDES:${PN} += "libtracefs-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtraceevent.so.1 \
libtracefs.so.1 \
libtracefs1"

inherit rpm
