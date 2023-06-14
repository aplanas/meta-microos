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

RPM_NAME = "xen-tools-4.17.1_04-1.1.aarch64.rpm"
RPM_HASH = "808dc63ad3f2c401c86015b29d61859277be6d9ef6b56e804e9d7ffbcae4098957c6bc1092766074f2f5fce4d2047e64485620cc87dfd6f5ce8b1c59e4583501"

RPROVIDES:${PN} += "config-xen-tools \
xen-tools \
xen-tools-ioemu"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/python3 \
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
