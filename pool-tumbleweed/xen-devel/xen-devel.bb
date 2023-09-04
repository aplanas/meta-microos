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

PV = "4.17.2_02"

RPM_NAME = "xen-devel-4.17.2_02-1.1.aarch64.rpm"
RPM_HASH = "3286f8262ea80ebf232274707655e1ecfa543991eeb215c98be4078b6f08269bfde7ce0b07a1492e20c15696e841a7fcca6ca99f4b9d9913ba5e89166716498f"

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
