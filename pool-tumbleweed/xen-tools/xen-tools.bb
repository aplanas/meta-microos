SUMMARY = "Xen Virtualization: Control tools for domain 0"
DESCRIPTION = "Xen is a virtual machine monitor for x86 that supports execution of \
multiple guest operating systems with unprecedented levels of \
performance and resource isolation. \
 \
This package contains the control tools that allow you to start, stop, \
migrate, and manage virtual machines. \
 \
In addition to this package you need to install xen and xen-libs \
to use Xen. \
 \
 \
Authors: \
-------- \
    Ian Pratt <ian.pratt@cl.cam.ac.uk>"
LICENSE = "GPL-2.0-only"

PV = "4.17.1_04"

RPM_NAME = "xen-tools-4.17.1_04-1.2.aarch64.rpm"
RPM_HASH = "00fdb0df6c0073e5d4442b9e821f76f039acc69cf0561f13676fb9b1db13b6e40287069cd9e2eb019f0a17ea56806cded906e1ab2e12d1a8b015e77f3a958af4"

RPROVIDES:${PN} += "config-xen-tools \
xen-tools \
xen-tools-ioemu"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libncurses.so.6 \
libsystemd.so.0 \
libtinfo.so.6 \
libxencall.so.1 \
libxenctrl.so.4.17 \
libxenevtchn.so.1 \
libxenforeignmemory.so.1 \
libxenfsimage.so.4.17 \
libxengnttab.so.1 \
libxenguest.so.4.17 \
libxenhypfs.so.1 \
libxenlight.so.4.17 \
libxenstat.so.4.17 \
libxenstore.so.4 \
libxentoollog.so.1 \
libxenvchan.so.4.17 \
libxlutil.so.4.17 \
libyajl.so.2 \
python-abi \
python3 \
python3-curses \
qemu-arm \
xen \
xen-libs"

inherit rpm
