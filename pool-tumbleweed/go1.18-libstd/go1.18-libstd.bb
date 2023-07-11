SUMMARY = "Go compiled shared library libstd.so"
DESCRIPTION = "Go standard library compiled to a dynamically loadable shared object libstd.so"
LICENSE = "BSD-3-Clause"

PV = "1.18.10"

RPM_NAME = "go1.18-libstd-1.18.10-4.2.aarch64.rpm"
RPM_HASH = "289277b4168644a6c83fd2358b6336524c7aed2a9577ef35726cf89df00de294142d27b41a1d0f18f5464981d7817652af7bd03d53bb8355e7e36ea9af5f2f48"

RPROVIDES:${PN} += "go-libstd \
go1.18-libstd \
libstd.so"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
