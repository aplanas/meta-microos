SUMMARY = "Service Discovery Plugin"
DESCRIPTION = "Service Discovery Plugin"
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "12.3.0"

RPM_NAME = "open-vm-tools-sdmp-12.3.0-1.1.aarch64.rpm"
RPM_HASH = "53a775196d6c5642e256c2b3ecc9de2708f8ba338ded66beda09f5a103fe8bbc27d6ceef1c0cc14e16b68a8d93e3b03c2471f63eb6f8e6250052c6b4f73620d6"

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
