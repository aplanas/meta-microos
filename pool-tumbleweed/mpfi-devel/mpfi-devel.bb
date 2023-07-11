SUMMARY = "Development files for the MPFI interval arithmetic computation library"
DESCRIPTION = "MPFI is a C library for arbitrary precision interval arithmetic with \
intervals represented using MPFR reliable floating-point numbers. \
 \
This subpackage provides the development headers and libraries for it."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.4"

RPM_NAME = "mpfi-devel-1.5.4-1.15.aarch64.rpm"
RPM_HASH = "9c74f4d5ebaefd51d560f5347ccd512a14b49a4f64e33e30613921cb9b55eb9005506d4082e9c8244028264eb5e41ef51a091ea52c6eabdcab73e81009a9f5e2"

RPROVIDES:${PN} += "mpfi-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
libmpfi0"

inherit rpm
