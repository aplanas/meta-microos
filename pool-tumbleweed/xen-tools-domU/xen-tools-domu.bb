SUMMARY = "Xen Virtualization: Control tools for domain U"
DESCRIPTION = "Xen is a virtual machine monitor for x86 that supports execution of \
multiple guest operating systems with unprecedented levels of \
performance and resource isolation. \
 \
This package contains tools that allow unprivileged domains to query \
the virtualized environment. \
 \
 \
 \
Authors: \
-------- \
    Ian Pratt <ian.pratt@cl.cam.ac.uk>"
LICENSE = "GPL-2.0-only"

PV = "4.17.2_02"

RPM_NAME = "xen-tools-domU-4.17.2_02-1.1.aarch64.rpm"
RPM_HASH = "46696e30f5b9774fb4bd33437f6397b142a0d7761cb6ae930c9ceb9bed51b5a9473298bac8e5ee0334df0558a0ca3f7abd71403766dbd3d730a98a0a12ccb0ca"

RPROVIDES:${PN} += "config-xen-tools-domU \
xen-tools-domU"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxenctrl.so.4.17 \
libxenguest.so.4.17 \
libxenstore.so.4 \
xen-libs"

inherit rpm
