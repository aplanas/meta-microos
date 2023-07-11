SUMMARY = "FFI library for closures as first-class C functions"
DESCRIPTION = "A library for building foreign function call interfaces in embedded \
interpreters. \
This library allows using closures (lambdas) as first-class C \
functions."
LICENSE = "GPL-2.0-or-later"

PV = "2.4"

RPM_NAME = "libtrampoline1-2.4-2.8.aarch64.rpm"
RPM_HASH = "759ba7f9c6cd742843bc1c496c17956a50a45c8ca4c2d98146567675ba790fb357a811fad093e58c2e6ce6634467666294c20d7d018e72ceba88e58ca3d27c68"

RPROVIDES:${PN} += "libtrampoline.so.1 \
libtrampoline1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
