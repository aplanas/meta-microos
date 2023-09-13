SUMMARY = "Go compiled shared library libstd.so"
DESCRIPTION = "Go standard library compiled to a dynamically loadable shared object libstd.so"
LICENSE = "BSD-3-Clause"

PV = "1.21.1"

RPM_NAME = "go1.21-libstd-1.21.1-1.1.aarch64.rpm"
RPM_HASH = "1e06e60270bb312e24df680e1f6ea06ed8d03b949264f2a6e99445cf69369d5c018ead7ed131b39e0c2b81b7a1886bf6a209f08d2d274742f4caa0e9c5a15f21"

RPROVIDES:${PN} += "go-libstd \
go1.21-libstd \
libstd.so"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
