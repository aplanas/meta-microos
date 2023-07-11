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

PV = "4.17.1_04"

RPM_NAME = "xen-tools-domU-4.17.1_04-1.2.aarch64.rpm"
RPM_HASH = "43befe6d7d2fcde478313ed6f1b6a553d84bdbe45e7836895f655c3f351c4f22ef8947dcd0d11eb4b420bb27594f0c1b7749119fbe3ae0839852010327b425a8"

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
