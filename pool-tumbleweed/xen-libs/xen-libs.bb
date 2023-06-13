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

RPROVIDES:${PN} += "libxencall.so.1()(64bit) \
libxenctrl.so.4.17()(64bit) \
libxendevicemodel.so.1()(64bit) \
libxenevtchn.so.1()(64bit) \
libxenforeignmemory.so.1()(64bit) \
libxenfsimage.so.4.17()(64bit) \
libxengnttab.so.1()(64bit) \
libxenguest.so.4.17()(64bit) \
libxenhypfs.so.1()(64bit) \
libxenlight.so.4.17()(64bit) \
libxenstat.so.4.17()(64bit) \
libxenstore.so.4()(64bit) \
libxentoolcore.so.1()(64bit) \
libxentoollog.so.1()(64bit) \
libxenvchan.so.4.17()(64bit) \
libxlutil.so.4.17()(64bit) \
xen-libs \
xen-libs(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfdt.so.1()(64bit) \
libnl-3.so.200()(64bit) \
libnl-3.so.200(libnl_3)(64bit) \
libnl-route-3.so.200()(64bit) \
libnl-route-3.so.200(libnl_3)(64bit) \
libuuid.so.1()(64bit) \
libyajl.so.2()(64bit) \
libz.so.1()(64bit)"

inherit rpm
