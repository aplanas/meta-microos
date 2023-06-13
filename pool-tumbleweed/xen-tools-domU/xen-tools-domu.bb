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

RPM_NAME = "xen-tools-domU-4.17.1_04-1.1.aarch64.rpm"
RPM_HASH = "aa2dd9207a26defceb33fe161433e6fc2ae41405b0f278d526995ef02ccc0c181e5ba526f2dc290b82241e00fe5de1e8cf004524b8dfcadeaa0d5caba8cad768"

RPROVIDES:${PN} += "config(xen-tools-domU) \
xen-tools-domU \
xen-tools-domU(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libxenctrl.so.4.17()(64bit) \
libxenguest.so.4.17()(64bit) \
libxenstore.so.4()(64bit) \
xen-libs"

inherit rpm
