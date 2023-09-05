SUMMARY = "Headers for the Unwind library"
DESCRIPTION = "A set of C programming interfaces to determine the call chain within a running \
program (libunwind), of a coredump image (libunwind-coredump), or of a separate \
process (libunwind-ptrace)."
LICENSE = "MIT"

PV = "1.7.2"

RPM_NAME = "libunwind-devel-1.7.2-1.1.aarch64.rpm"
RPM_HASH = "35e3f811e0cfec301b8b881d77f769567a0eeb7812984d3f68d3579155a9fcf096fa561a97911a712747e929bceff5eb813a2144e3e340ed211fa9618e1afae9"

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
