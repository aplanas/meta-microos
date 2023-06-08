SUMMARY = "Code page 437 emulator"
DESCRIPTION = "Cp437 is a program to emulate an old-style 'code page 437' / 'IBM-PC' character \
set terminal on a modern terminal emulator that uses UTF-8 or similar. \
 \
It was written for the purpose of running the BitchX IRC client, which utilises \
CP437 line-drawing characters in its default theme and artwork.  It should \
also be broadly useful for things like viewing CP437 'ANSI art', running \
nethack with the IBMgraphics option or running EPIC with scripts that use CP437 \
artwork."
LICENSE = "BSD-3-Clause"

PV = "0.6"

RPM_NAME = "cp437-0.6-1.12.aarch64.rpm"
RPM_HASH = "5a59c6451a0787301b1022cda72bc6f572e1001f66c78f73d56d9aa1e39deebe4b7f4d9ef5c2e924eb1b10adf7c9e938177cb4a8950f66ec4bacfe60cd0d6c1b"

RPROVIDES:${PN} += "cp437 cp437(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
