SUMMARY = "Xen Virtualization: Libraries"
DESCRIPTION = "Xen is a virtual machine monitor for x86 that supports execution of \
multiple guest operating systems with unprecedented levels of \
performance and resource isolation. \
 \
This package contains the libraries used to interact with the Xen \
virtual machine monitor. \
 \
In addition to this package you need to install xen and xen-tools \
to use Xen. \
 \
 \
Authors: \
-------- \
    Ian Pratt <ian.pratt@cl.cam.ac.uk>"
LICENSE = "GPL-2.0-only"

PV = "4.17.1_06"

RPM_NAME = "xen-libs-4.17.1_06-1.1.aarch64.rpm"
RPM_HASH = "3319da23806729c1bf03901d8af6141e866a7363b6b3cc4bcf4c9426c95abc9771e12423e39256e7902bcc74597bbf548f8376ec02098709356a9e835800a2e5"

RPROVIDES:${PN} += "libxencall.so.1 \
libxenctrl.so.4.17 \
libxendevicemodel.so.1 \
libxenevtchn.so.1 \
libxenforeignmemory.so.1 \
libxenfsimage.so.4.17 \
libxengnttab.so.1 \
libxenguest.so.4.17 \
libxenhypfs.so.1 \
libxenlight.so.4.17 \
libxenstat.so.4.17 \
libxenstore.so.4 \
libxentoolcore.so.1 \
libxentoollog.so.1 \
libxenvchan.so.4.17 \
libxlutil.so.4.17 \
xen-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfdt.so.1 \
libnl-3.so.200 \
libnl-route-3.so.200 \
libuuid.so.1 \
libyajl.so.2 \
libz.so.1"

inherit rpm
