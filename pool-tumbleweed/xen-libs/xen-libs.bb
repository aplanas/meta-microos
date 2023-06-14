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

PV = "4.17.1_04"

RPM_NAME = "xen-libs-4.17.1_04-1.1.aarch64.rpm"
RPM_HASH = "3736afd141b3d5e1c5fc005dbdf8dddff053fd53bb0af3c3dbcf6937e4a738cadb85b8f21a7d158b116aba36cfaa505e6dceb2bceeae46ecdd8627133bfd8d43"

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
