SUMMARY = "Container Info Plugin"
DESCRIPTION = "This package interfaces with the container runtime to retrieve a list of containers running on a Linux guest"
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only"

PV = "12.2.0"

RPM_NAME = "open-vm-tools-containerinfo-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "6ea2df3ec9da20af32ed44605b9585e540e6ccd3b007ce417e42e6400135b39d07ccdde1b436da6cca58922c3e8d16eb3ff21c03bfcb7f8ffc3b98085ef8ce24"

RPROVIDES:${PN} += "libcontainerInfo.so \
open-vm-tools-containerinfo"

RDEPENDS:${PN} += "/bin/sh \
curl \
ld-linux-aarch64.so.1 \
libabsl-synchronization.so.2301.0.0 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpr.so.31 \
libgrpc++.so.1.54 \
libgrpc.so.31 \
libprotobuf-3.21.12.so \
libstdc++.so.6 \
libvmtools.so.0 \
open-vm-tools"

inherit rpm
