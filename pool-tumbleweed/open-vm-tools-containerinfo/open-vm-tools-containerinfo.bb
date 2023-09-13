SUMMARY = "Container Info Plugin"
DESCRIPTION = "This package interfaces with the container runtime to retrieve a list of containers running on a Linux guest"
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "12.3.0"

RPM_NAME = "open-vm-tools-containerinfo-12.3.0-1.1.aarch64.rpm"
RPM_HASH = "c27101cffd8b975cd3cfeda8e168b84bc8ba02518a92c72773cb957a957b2eade8ef34baee9ab54ecea4babfe024a3e2ea70e52defb3c0b8e859bdd0f7e90a39"

RPROVIDES:${PN} += "libcontainerInfo.so \
open-vm-tools-containerinfo"

RDEPENDS:${PN} += "/usr/bin/sh \
curl \
ld-linux-aarch64.so.1 \
libabsl-cord.so.2308.0.0 \
libabsl-cordz-functions.so.2308.0.0 \
libabsl-cordz-info.so.2308.0.0 \
libabsl-synchronization.so.2308.0.0 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpr.so.35 \
libgrpc++.so.1.58 \
libgrpc.so.35 \
libprotobuf-3.21.12.so \
libstdc++.so.6 \
libvmtools.so.0 \
open-vm-tools"

inherit rpm
