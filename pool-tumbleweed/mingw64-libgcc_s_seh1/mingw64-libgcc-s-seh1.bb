SUMMARY = "MinGW Windows compiler for C shared libraries"
DESCRIPTION = "MinGW Windows compiler for C shared libraries \
 \
This libgcc build supports Structured Exception Handling (SEH), which \
is the native exception handling mechanism for Windows. \
[SEH support is currently only implemented for the x86_64 target, \
which is why the 32bit mingw package set does not contain it.]"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw64-libgcc_s_seh1-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "f310032995d688b4005a08edea91d96acf5bf6a1cf7d517544d6b2c0ee5cdaa725da142a6bdf1a41f5e078ee6127c27b0a48c32b8b1f9f36edbc03c6d6237738"

RPROVIDES:${PN} += "mingw64-libgcc \
mingw64-libgcc-s-seh-1.dll \
mingw64-libgcc-s-seh1"

RDEPENDS:${PN} += "mingw64-libwinpthread-1.dll"

inherit rpm
