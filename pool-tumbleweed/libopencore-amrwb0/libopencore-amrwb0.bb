SUMMARY = "Shared library part of opencore-amr"
DESCRIPTION = "Library of OpenCORE Framework implementation of Adaptive Multi Rate \
Wideband speech codec."
LICENSE = "Apache-2.0"

PV = "0.1.6"

RPM_NAME = "libopencore-amrwb0-0.1.6-1.3.aarch64.rpm"
RPM_HASH = "4ecf4e888927ee810a6851ba3d0af487731d94bfa90a1144ec35e61d9b12bd2c68a9ac09ff6ea998f90f6d079b948394a343e67f4ee1062a4a7a31d2c5e8bcab"

RPROVIDES:${PN} += "libopencore-amrwb.so.0()(64bit) \
libopencore-amrwb0 \
libopencore-amrwb0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
