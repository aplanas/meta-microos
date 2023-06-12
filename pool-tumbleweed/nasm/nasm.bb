SUMMARY = "Netwide Assembler (An x86 Assembler)"
DESCRIPTION = "NASM is a prototype general-purpose x86 assembler. It can currently output \
several binary formats, including ELF, a.out, Win32, and OS/2."
LICENSE = "BSD-2-Clause"

PV = "2.16.01"

RPM_NAME = "nasm-2.16.01-1.3.aarch64.rpm"
RPM_HASH = "ed06f3848baa44867d242b3dc98cfcde0c73d2ce7fc2f62428821f0e66120961a59a29ffbf7ff0cad93b78e3e7f017d24c3e5e4bc96095319fd06527c947c5c7"

RPROVIDES:${PN} += "nasm \
nasm(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
