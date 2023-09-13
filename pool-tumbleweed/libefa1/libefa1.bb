SUMMARY = "EFA runtime library"
DESCRIPTION = "This package contains the efa runtime library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "47.0"

RPM_NAME = "libefa1-47.0-3.1.aarch64.rpm"
RPM_HASH = "868511e5f021a2a7af19d93d0d4e85fea6a4a896ddcb2ee1a02779db58b29e65ea604ae40910a78e372f3e9b5debc00971ddeac55964789e8fe7c03e4f45d7eb"

RPROVIDES:${PN} += "libefa.so.1 \
libefa1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libibverbs.so.1"

inherit rpm
