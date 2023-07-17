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

PV = "4.17.1_06"

RPM_NAME = "xen-tools-4.17.1_06-1.1.aarch64.rpm"
RPM_HASH = "cdbe2b44d72999854824ca10fcf36e86629f41beef271695448eedc66da3d4a206bffdc16a10bcc0f73c60e896aabea1441824f30a46dd3bff2088f927476263"

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
