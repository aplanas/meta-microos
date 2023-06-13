SUMMARY = "MinGW Windows compiler for C shared libraries"
DESCRIPTION = "MinGW Windows compiler for C shared libraries \
 \
This libgcc build uses SJLJ, a method for exception handling based on \
setjmp/longjmp. SJLJ-based EH is much slower than DWARF-2 EH, \
penalizing even normal execution when no exceptions are thrown, but \
can work across code that has not been compiled with GCC or that does \
not have call-stack unwinding information. \
 \
[The DWARF-2 EH implementation for Windows is not at all designed to \
work under 64-bit Windows applications. In Win32 mode, the exception \
unwind handler cannot propagate through non-DW2 aware code, which \
means that any exception going through any non-DW2-aware 'foreign \
frame' code will fail, including Windows system DLLs and DLLs built \
with Visual Studio. DWARF-2 unwinding code in GCC inspects the x86 \
unwinding assembly and is unable to proceed without other DWARF-2 \
unwind information.]"
LICENSE = "GPL-3.0-or-later"

PV = "12.2.0"

RPM_NAME = "mingw32-libgcc_s_sjlj1-12.2.0-2.1.aarch64.rpm"
RPM_HASH = "61a3ba4f88f05870d955e9f7789c940ae289a4c7058d0cac4b264d694695beaf019db26e6e586302f6a1dc25d36526a671ec4780b9262b12e0146c2a857f4d2d"

RPROVIDES:${PN} += "mingw32(libgcc_s_sjlj-1.dll) \
mingw32-libgcc \
mingw32-libgcc_s_sjlj1 \
mingw32-libgcc_s_sjlj1(aarch-64)"

RDEPENDS:${PN} += "mingw32(libwinpthread-1.dll)"

inherit rpm
