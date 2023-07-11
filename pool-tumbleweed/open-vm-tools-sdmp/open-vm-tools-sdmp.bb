SUMMARY = "Service Discovery Plugin"
DESCRIPTION = "Service Discovery Plugin"
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "12.2.0"

RPM_NAME = "open-vm-tools-sdmp-12.2.0-5.1.aarch64.rpm"
RPM_HASH = "9d8cf8f92bcc44be683504f78118f653375526708a579cee7243351428fa256fc431f3c8d1de14ad68c6775b9db2f7395dfdb23dab2a0f8e3d694cf8b5569d59"

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
