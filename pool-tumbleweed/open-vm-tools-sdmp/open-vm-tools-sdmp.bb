SUMMARY = "Service Discovery Plugin"
DESCRIPTION = "Service Discovery Plugin"
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "12.2.0"

RPM_NAME = "open-vm-tools-sdmp-12.2.0-5.2.aarch64.rpm"
RPM_HASH = "cddb422fe2b68cea63cdafdae0fd04168a27a1844e6d01feda8bf2e936f1f40cceab04f1f01ec2505d35c0b32e1e79a00e438a2b47d244c8e89edf417820ac2e"

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
