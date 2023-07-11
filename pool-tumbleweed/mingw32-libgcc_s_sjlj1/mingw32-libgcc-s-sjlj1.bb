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

RPM_NAME = "mingw32-libgcc_s_sjlj1-12.2.0-3.1.aarch64.rpm"
RPM_HASH = "650e5a064b8d9b4948744e9f03d9be24050562de3b00459b62db8e7f360d4c0918c1375dd4f3cafcb8b4cded056fabb687f1311d4ddd4a60dd841a3c9a8776f7"

RPROVIDES:${PN} += "mingw32-libgcc \
mingw32-libgcc-s-sjlj-1.dll \
mingw32-libgcc-s-sjlj1"

RDEPENDS:${PN} += "mingw32-libwinpthread-1.dll"

inherit rpm
