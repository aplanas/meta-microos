SUMMARY = "Headers for the Unwind library"
DESCRIPTION = "A set of C programming interfaces to determine the call chain within a running \
program (libunwind), of a coredump image (libunwind-coredump), or of a separate \
process (libunwind-ptrace)."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "libunwind-devel-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "5d1cd1d70296c6c2a4a0a34e9f59678c081f9ba3377c155ed66e87923375d15f5b91a91f2e84cb6a1dd69482320d4030037f33df9815e8c9c4417e4c80e24fb5"

RPROVIDES:${PN} += "libunwind-devel \
pkgconfig-libunwind \
pkgconfig-libunwind-coredump \
pkgconfig-libunwind-generic \
pkgconfig-libunwind-ptrace \
pkgconfig-libunwind-setjmp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libunwind-coredump0 \
libunwind-ptrace0 \
libunwind-setjmp0 \
libunwind8 \
pkgconfig-libunwind \
pkgconfig-libunwind-generic"

inherit rpm
