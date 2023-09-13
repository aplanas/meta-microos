SUMMARY = "Go compiled shared library libstd.so"
DESCRIPTION = "Go standard library compiled to a dynamically loadable shared object libstd.so"
LICENSE = "BSD-3-Clause"

PV = "1.19.13"

RPM_NAME = "go1.19-libstd-1.19.13-1.1.aarch64.rpm"
RPM_HASH = "856ec4a8b70aa64e0e317567af16e698133a4b054b7112de14f111719184964ac3dc46aeb986829a48d51a7256bcf8dbc89af33803e490dc01c8081d85a106d4"

RPROVIDES:${PN} += "go-libstd \
go1.19-libstd \
libstd.so"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
