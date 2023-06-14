SUMMARY = "Development files for the MPFI interval arithmetic computation library"
DESCRIPTION = "MPFI is a C library for arbitrary precision interval arithmetic with \
intervals represented using MPFR reliable floating-point numbers. \
 \
This subpackage provides the development headers and libraries for it."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.4"

RPM_NAME = "mpfi-devel-1.5.4-1.14.aarch64.rpm"
RPM_HASH = "2854428cb74305293545a10fe71beeb910f92eca713aedf740e5d22042b80d11a282a2ba88197f2ad9f48e885f8cf7ec6b6c7dba2a6e60543d7e7c7a34ec075c"

RPROVIDES:${PN} += "mpfi-devel"

RDEPENDS:${PN} += "/bin/sh \
libmpfi0"

inherit rpm
