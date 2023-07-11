SUMMARY = "io_uring I/O access library for non-C/C++ languages"
DESCRIPTION = "Foreign function interface for liburing, offering non-C/C++ language \
integration."
LICENSE = "(GPL-2.0-only & LGPL-2.1-or-later) | MIT"

PV = "2.4"

RPM_NAME = "liburing-ffi2-2.4-1.1.aarch64.rpm"
RPM_HASH = "e93f7cf440b6b5ad033696fa164b9223eb839a6ff95500025c905912544c8761f4f9cb098f7c6045f5a600efac66b8549d603e4fe8ec2f307150db06323a84ff"

RPROVIDES:${PN} += "liburing-ffi.so.2 \
liburing-ffi2"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
