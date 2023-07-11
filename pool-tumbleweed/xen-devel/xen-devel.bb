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

PV = "4.17.1_04"

RPM_NAME = "xen-devel-4.17.1_04-1.2.aarch64.rpm"
RPM_HASH = "f116a35c5745ab52539477a8a2babed9a8937632bdc879fdc076b1b0b6afde626440b3d6b293f85fd96d811cfea0f8f1395f5876f7a13fe936c60fe4070e3ac3"

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
