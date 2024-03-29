SUMMARY = "Debugs memory leak of a running process"
DESCRIPTION = "Memleax is capable of debugging memory leak of a running process by \
attaching to it. There is no need to recompile the program or restart the \
target process."
LICENSE = "GPL-2.0-only"

PV = "1.1.1"

RPM_NAME = "memleax-1.1.1-3.3.aarch64.rpm"
RPM_HASH = "f30ac6695fe4fc0425d41a8fdf059e25f9c50b748a6bcc712c24ccf95ebc012a41a42e73b4f2d05132316f83e0ccdadc6c8d4729ddf695fb4c11e6cd7b77a115"

RPROVIDES:${PN} += "memleax"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdw.so.1 \
libelf.so.1 \
libunwind-aarch64.so.8 \
libunwind-ptrace.so.0 \
libunwind.so.8"

inherit rpm
