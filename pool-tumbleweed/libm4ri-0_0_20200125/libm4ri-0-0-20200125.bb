SUMMARY = "Library for linear arithmetic over GF(2)"
DESCRIPTION = "M4RI is a library for arithmetic with dense matrices over the \
Galois Field GF(2)."
LICENSE = "GPL-2.0-or-later"

PV = "20200125"

RPM_NAME = "libm4ri-0_0_20200125-20200125-1.4.aarch64.rpm"
RPM_HASH = "914f63467c0b2d273883f1bc5b0938685428e632e8a4a709652eb3d5962cbcdbe5e96ffea2e511c93b8926bd7d6f4bb9be59f535caf8e9495a0724058e26c9a0"

RPROVIDES:${PN} += "libm4ri-0-0-20200125 \
libm4ri-0.0.20200125.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libpng16.so.16"

inherit rpm
