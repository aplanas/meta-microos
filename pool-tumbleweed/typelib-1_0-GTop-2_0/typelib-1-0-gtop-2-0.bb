SUMMARY = "Introspection bindings for libgtop"
DESCRIPTION = "A library that fetches information about the running system, such as \
CPU and memory usage and active processes. \
 \
On Linux systems, this information is taken directly from the /proc \
file system. On other systems, a server is used to read information \
from /dev/kmem. \
 \
This package provides the GObject Introspection bindings for libgtop."
LICENSE = "GPL-2.0-or-later"

PV = "2.40.0"

RPM_NAME = "typelib-1_0-GTop-2_0-2.40.0-4.4.aarch64.rpm"
RPM_HASH = "7ec3e23789c0b29449647a5751d14f328256599df1420d3fa82a1c19da7b68ca8b5ff5cb05ec5e794254093866f8bcc56578adbd5c8e84c1fa2d45e739625c84"

RPROVIDES:${PN} += "typelib-1-0-GTop-2-0 \
typelib-GTop"

RDEPENDS:${PN} += "libgtop-2.0.so.11"

inherit rpm
