SUMMARY = "MinGW Windows compiler for C shared libraries"
DESCRIPTION = "MinGW Windows compiler for C shared libraries \
 \
This libgcc build supports Structured Exception Handling (SEH), which \
is the native exception handling mechanism for Windows. \
[SEH support is currently only implemented for the x86_64 target, \
which is why the 32bit mingw package set does not contain it.]"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw64-libgcc_s_seh1-12.2.0-2.1.aarch64.rpm"
RPM_HASH = "9455fdbb7e45c5bac4877ac29bd444fed73d1090beaf9cefed036e44e858dc90f4d54adb10382987114080eefc90d9cca1627acdcba1cffe33cbad536dea3a8c"

RPROVIDES:${PN} += "mingw64(libgcc_s_seh-1.dll) \
mingw64-libgcc \
mingw64-libgcc_s_seh1 \
mingw64-libgcc_s_seh1(aarch-64)"

RDEPENDS:${PN} += "mingw64(libwinpthread-1.dll)"

inherit rpm
