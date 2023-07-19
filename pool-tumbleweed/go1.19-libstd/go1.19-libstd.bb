SUMMARY = "Go compiled shared library libstd.so"
DESCRIPTION = "Go standard library compiled to a dynamically loadable shared object libstd.so"
LICENSE = "BSD-3-Clause"

PV = "1.19.11"

RPM_NAME = "go1.19-libstd-1.19.11-1.1.aarch64.rpm"
RPM_HASH = "6462e1e0ea9d4f96c7aa8efb54739529a71982fe113b9247a4b0447c7ea397b2d99fb89132669e16963b4a396237a55486ebdd1a057be8d4bb9538c80c64caa0"

RPROVIDES:${PN} += "go-libstd \
go1.19-libstd \
libstd.so"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
