SUMMARY = "Go compiled shared library libstd.so"
DESCRIPTION = "Go standard library compiled to a dynamically loadable shared object libstd.so"
LICENSE = "BSD-3-Clause"

PV = "1.20.6"

RPM_NAME = "go1.20-libstd-1.20.6-1.1.aarch64.rpm"
RPM_HASH = "c824dd6d35b8684a94ad41cb6b2a146c67c7aa349d170f0cc5f4c4e49e8532a1b0016e3e22f9469c686ca7f88375c9b54ab23e5999ac63113fd3f8541b3ae3ab"

RPROVIDES:${PN} += "go-libstd \
go1.20-libstd \
libstd.so"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
