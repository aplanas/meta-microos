SUMMARY = "Go compiled shared library libstd.so"
DESCRIPTION = "Go standard library compiled to a dynamically loadable shared object libstd.so"
LICENSE = "BSD-3-Clause"

PV = "1.20.7"

RPM_NAME = "go1.20-libstd-1.20.7-1.1.aarch64.rpm"
RPM_HASH = "fc38ccf3dfe441f5561a68cf5884ad4b28cd158af5cc2702a4694765cb98c01c934778c4afbe1b75623feb71ea957e4bf7cff557b1aaf75111a74cb9ed390817"

RPROVIDES:${PN} += "go-libstd \
go1.20-libstd \
libstd.so"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
