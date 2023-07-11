SUMMARY = "Shared library part of opencore-amr"
DESCRIPTION = "Library of OpenCORE Framework implementation of Adaptive Multi Rate \
Wideband speech codec."
LICENSE = "Apache-2.0"

PV = "0.1.6"

RPM_NAME = "libopencore-amrwb0-0.1.6-1.4.aarch64.rpm"
RPM_HASH = "ca18963b3d4dfec7b744ba98c46910dbf911b5d5476f54ab8bf0738cc6269839619a8e90ee86435f7434472f5e09c892ae7813d01ef04754c1bf3ac3327259ae"

RPROVIDES:${PN} += "libopencore-amrwb.so.0 \
libopencore-amrwb0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
