SUMMARY = "FFI library for closures with variable arguments"
DESCRIPTION = "A library for building foreign function call interfaces in embedded \
interpreters. \
 \
This library allows for closures with variable arguments as \
first-class C functions (a reentrant combination of vacall and \
trampoline)."
LICENSE = "GPL-2.0-or-later"

PV = "2.4"

RPM_NAME = "libcallback1-2.4-2.8.aarch64.rpm"
RPM_HASH = "b5f4523179d99f4463bc62cb4773b14024b85f2a94aac4fe6fac496d0dc627ac4162e740cc701dcbe97a7ebf86f79ab9dcd7d45b64177123dc953af22e9a91ad"

RPROVIDES:${PN} += "libcallback.so.1 \
libcallback1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
