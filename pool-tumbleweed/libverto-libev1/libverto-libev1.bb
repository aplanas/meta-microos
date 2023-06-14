SUMMARY = "Backend module for libverto -- libev1"
DESCRIPTION = "Module for libverto which provides integration with libev. \
 \
This package provides libverto-module-base since it supports io, \
timeout and signal."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "libverto-libev1-0.3.2-3.1.aarch64.rpm"
RPM_HASH = "e29c3edd9dd15d874ffd4c5379dea2e146c3d5bfbc72d02c8c66a48def326a763329cca63120d3354c8d04374db69c5fd3c16844951a0257a1ee47d3d3f4362a"

RPROVIDES:${PN} += "libverto-libev.so.1 \
libverto-libev1 \
libverto-module-base"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libev.so.4 \
libverto.so.1 \
libverto1"

inherit rpm
