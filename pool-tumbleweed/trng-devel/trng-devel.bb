SUMMARY = "Headers and devel files for TRNG"
DESCRIPTION = "TRNG is a C++ pseudo random number generator library. \
 \
This package provides the headers and devel files for developing \
applications against TRNG."
LICENSE = "BSD-3-Clause"

PV = "4.24"

RPM_NAME = "trng-devel-4.24-2.7.aarch64.rpm"
RPM_HASH = "9fb6c944d8b58fb927233d0b344a37b89d2059244a5e3677009f2b1a9461841b83178e06b1e7bf3bcaaaeef6417b27a12f00f6d1a957087f752e39eb2939d1a9"

RPROVIDES:${PN} += "trng-devel"

RDEPENDS:${PN} += "libtrng4-24"

inherit rpm
