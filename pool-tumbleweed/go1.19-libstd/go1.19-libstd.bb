SUMMARY = "Go compiled shared library libstd.so"
DESCRIPTION = "Go standard library compiled to a dynamically loadable shared object libstd.so"
LICENSE = "BSD-3-Clause"

PV = "1.19.10"

RPM_NAME = "go1.19-libstd-1.19.10-1.1.aarch64.rpm"
RPM_HASH = "9c4d027a489dc3e46c74a0ceaf7162dd7070f6f34f046a29126b4618782bd5257d0f1c32d776b3267ab7514cb27fd496b4f4214b560e7a7415fa6237d2d360a5"

RPROVIDES:${PN} += "go-libstd \
go1.19-libstd \
libstd.so"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
