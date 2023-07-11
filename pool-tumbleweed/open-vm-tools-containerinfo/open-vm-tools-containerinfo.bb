SUMMARY = "Container Info Plugin"
DESCRIPTION = "This package interfaces with the container runtime to retrieve a list of containers running on a Linux guest"
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "12.2.0"

RPM_NAME = "open-vm-tools-containerinfo-12.2.0-5.1.aarch64.rpm"
RPM_HASH = "0b5d7b5bc64e1414a547828968eeff617a487c390acb43a7dbd1ace55c26d00cb507fafb5ba4448df8674e5699bb9e00f22216ef54aa140d781f8fb40eb791f5"

RPROVIDES:${PN} += "libcontainerInfo.so \
open-vm-tools-containerinfo"

RDEPENDS:${PN} += "/usr/bin/sh \
curl \
ld-linux-aarch64.so.1 \
libabsl-cord.so.2301.0.0 \
libabsl-cordz-functions.so.2301.0.0 \
libabsl-cordz-info.so.2301.0.0 \
libabsl-synchronization.so.2301.0.0 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpr.so.33 \
libgrpc++.so.1.56 \
libgrpc.so.33 \
libprotobuf-3.21.12.so \
libstdc++.so.6 \
libvmtools.so.0 \
open-vm-tools"

inherit rpm
