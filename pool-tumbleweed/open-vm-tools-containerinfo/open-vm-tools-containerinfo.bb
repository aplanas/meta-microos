SUMMARY = "Container Info Plugin"
DESCRIPTION = "This package interfaces with the container runtime to retrieve a list of containers running on a Linux guest"
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "12.2.0"

RPM_NAME = "open-vm-tools-containerinfo-12.2.0-5.2.aarch64.rpm"
RPM_HASH = "01d1215124697d8000197c87f9fc7c7b0947dd2f5130253f1e208dd39ab4464a43f395933fd4c4833b792235946dab377550ff7eb66ae82febc07fd950c344ab"

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
libgpr.so.34 \
libgrpc++.so.1.57 \
libgrpc.so.34 \
libprotobuf-3.21.12.so \
libstdc++.so.6 \
libvmtools.so.0 \
open-vm-tools"

inherit rpm
