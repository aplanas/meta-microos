SUMMARY = "C->Haskell FFI tool that gives some cross-language type safety"
DESCRIPTION = "C->Haskell assists in the development of Haskell bindings to C libraries. \
It extracts interface information from C header files and generates Haskell \
code with foreign imports and marshaling. Unlike writing foreign imports by \
hand (or using hsc2hs), this ensures that C functions are imported with the \
correct Haskell types."
LICENSE = "GPL-2.0-or-later"

PV = "0.28.8"

RPM_NAME = "c2hs-0.28.8-4.7.aarch64.rpm"
RPM_HASH = "e93f28357dfca1fe25a116dd194f29d2d2cd84361e759b38e09e67520fde7cd071d96ba9a61db0475dec26e0236862475bb69effc6f658fb22a301f31230c5b0"

RPROVIDES:${PN} += "c2hs"

RDEPENDS:${PN} += "libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
