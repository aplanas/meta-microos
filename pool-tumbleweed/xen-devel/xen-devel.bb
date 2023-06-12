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

RPM_NAME = "xen-devel-4.17.1_04-1.1.aarch64.rpm"
RPM_HASH = "7613aeed4dfb32d00e8425a30c5a90946479d46d4b6764fed407ac2c3123715c861062d7ade553c05ec2f327a3dd0db42918264dbfccc4ad741eb7e97a68748d"

RPROVIDES:${PN} += "pkgconfig(xencall) \
pkgconfig(xencontrol) \
pkgconfig(xendevicemodel) \
pkgconfig(xenevtchn) \
pkgconfig(xenforeignmemory) \
pkgconfig(xengnttab) \
pkgconfig(xenguest) \
pkgconfig(xenhypfs) \
pkgconfig(xenlight) \
pkgconfig(xenstat) \
pkgconfig(xenstore) \
pkgconfig(xentoolcore) \
pkgconfig(xentoollog) \
pkgconfig(xenvchan) \
pkgconfig(xlutil) \
xen-devel \
xen-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libuuid-devel \
pkgconfig(xencall) \
pkgconfig(xencontrol) \
pkgconfig(xendevicemodel) \
pkgconfig(xenevtchn) \
pkgconfig(xenforeignmemory) \
pkgconfig(xengnttab) \
pkgconfig(xenguest) \
pkgconfig(xenhypfs) \
pkgconfig(xenlight) \
pkgconfig(xenstore) \
pkgconfig(xentoolcore) \
pkgconfig(xentoollog) \
xen-libs"

inherit rpm
