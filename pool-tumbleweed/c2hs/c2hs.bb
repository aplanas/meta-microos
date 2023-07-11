SUMMARY = "C->Haskell FFI tool that gives some cross-language type safety"
DESCRIPTION = "C->Haskell assists in the development of Haskell bindings to C libraries. \
It extracts interface information from C header files and generates Haskell \
code with foreign imports and marshaling. Unlike writing foreign imports by \
hand (or using hsc2hs), this ensures that C functions are imported with the \
correct Haskell types."
LICENSE = "GPL-2.0-or-later"

PV = "0.28.8"

RPM_NAME = "c2hs-0.28.8-4.5.aarch64.rpm"
RPM_HASH = "fabb4869d845d74c5d05e8b50e56602cc2bea687a0987b23cd5d727216d93333014c7c9cd85ffd3f66dba7734bd246a0c5da914c6534591ca9b6cee009b6c702"

RPROVIDES:${PN} += "c2hs"

RDEPENDS:${PN} += "libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
