SUMMARY = "A pipeline manipulation library"
DESCRIPTION = "libpipeline is a C library for setting up and running pipelines of \
processes, without needing to involve shell command-line parsing which \
is often error-prone and insecure. This alleviates programmers of the \
need to laboriously construct pipelines using lower-level primitives \
such as fork(2) and execve(2)."
LICENSE = "GPL-3.0-or-later"

PV = "1.5.7"

RPM_NAME = "libpipeline1-1.5.7-1.2.aarch64.rpm"
RPM_HASH = "e0f7dc9a3d73387c3aa4ded2bf5a64e2d2d0c89c229d870948ebcb9fc26448f61d2e9298218c11c51841f8700b51903b36e2fe1c077cf2917ca96b653bfaa97d"

RPROVIDES:${PN} += "libpipeline.so.1()(64bit) \
libpipeline1 \
libpipeline1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.26)(64bit)"

inherit rpm
