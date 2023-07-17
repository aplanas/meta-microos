SUMMARY = "Xen Virtualization: Headers and libraries for development"
DESCRIPTION = "Xen is a virtual machine monitor for x86 that supports execution of \
multiple guest operating systems with unprecedented levels of \
performance and resource isolation. \
 \
This package contains the libraries and header files needed to create \
tools to control virtual machines. \
 \
 \
 \
Authors: \
-------- \
    Ian Pratt <ian.pratt@cl.cam.ac.uk>"
LICENSE = "GPL-2.0-only"

PV = "4.17.1_06"

RPM_NAME = "xen-devel-4.17.1_06-1.1.aarch64.rpm"
RPM_HASH = "9d9cc3e4ad0ae5b2f91919d09d4b6a6ca09c250b6b029a8aeca1780e3bd88687dae16b847bd8a0df4df76f0b43df66e262cdae2cdff02e93076a733894dfd23f"

RPROVIDES:${PN} += "pkgconfig-xencall \
pkgconfig-xencontrol \
pkgconfig-xendevicemodel \
pkgconfig-xenevtchn \
pkgconfig-xenforeignmemory \
pkgconfig-xengnttab \
pkgconfig-xenguest \
pkgconfig-xenhypfs \
pkgconfig-xenlight \
pkgconfig-xenstat \
pkgconfig-xenstore \
pkgconfig-xentoolcore \
pkgconfig-xentoollog \
pkgconfig-xenvchan \
pkgconfig-xlutil \
xen-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libuuid-devel \
pkgconfig-xencall \
pkgconfig-xencontrol \
pkgconfig-xendevicemodel \
pkgconfig-xenevtchn \
pkgconfig-xenforeignmemory \
pkgconfig-xengnttab \
pkgconfig-xenguest \
pkgconfig-xenhypfs \
pkgconfig-xenlight \
pkgconfig-xenstore \
pkgconfig-xentoolcore \
pkgconfig-xentoollog \
xen-libs"

inherit rpm
