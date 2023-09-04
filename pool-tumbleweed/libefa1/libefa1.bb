SUMMARY = "EFA runtime library"
DESCRIPTION = "This package contains the efa runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "libefa1-47.0-2.2.aarch64.rpm"
RPM_HASH = "a4a44f04d814e06924809ff9078cd1766824c215e801e1c98b7eb3d6309d6411e01e9e8df5e34324006e6e19a23c667309b7dadf56fa3cb31d90ea856403fa71"

RPROVIDES:${PN} += "libefa.so.1 \
libefa1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs.so.1"

inherit rpm
