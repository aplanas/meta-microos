SUMMARY = "Service Discovery Plugin"
DESCRIPTION = "Service Discovery Plugin"
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "12.2.0"

RPM_NAME = "open-vm-tools-sdmp-12.2.0-6.1.aarch64.rpm"
RPM_HASH = "bf00208b8cd813b4c8eda3004133fc7694b46f3457d0d225ffb5fd549be215461fa4240ce14ca83d4ed3049b5a3ad2810e8cb46e911fd3d382f493609b604c42"

RPROVIDES:${PN} += "libserviceDiscovery.so \
open-vm-tools-sdmp"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libvmtools.so.0 \
open-vm-tools"

inherit rpm
