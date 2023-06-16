SUMMARY = "Service Discovery Plugin"
DESCRIPTION = "Service Discovery Plugin"
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "12.2.0"

RPM_NAME = "open-vm-tools-sdmp-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "0a42c1a24ce72a07c5698237c832d351a2e84b8fdaf6b07b469a2d1bfa90ca857bc203dde7c646e72341e21454b8b2beaeecd3003cfbb466ed68b817e600ed7c"

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
