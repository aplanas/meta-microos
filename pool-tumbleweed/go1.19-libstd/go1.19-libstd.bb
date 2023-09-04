SUMMARY = "Go compiled shared library libstd.so"
DESCRIPTION = "Go standard library compiled to a dynamically loadable shared object libstd.so"
LICENSE = "BSD-3-Clause"

PV = "1.19.12"

RPM_NAME = "go1.19-libstd-1.19.12-1.1.aarch64.rpm"
RPM_HASH = "fcd8c5a0d7d0b336fd5b66559774207636efb990e5a940d66bbe2d3975c4532ccfa01c211b5366f19817b2e1e7a4eadd9c9658cf3e63ffb30c550f2b5b5e19ef"

RPROVIDES:${PN} += "go-libstd \
go1.19-libstd \
libstd.so"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
