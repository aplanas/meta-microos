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

PV = "4.17.1_06"

RPM_NAME = "xen-tools-domU-4.17.1_06-1.1.aarch64.rpm"
RPM_HASH = "6590e1c95f3abf294b3033eab39bce26fa5685d169d753634b085702755f296412c24b959747513f9ffe5949fa265eef5978be38398aa451660aa436673b12dc"

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
