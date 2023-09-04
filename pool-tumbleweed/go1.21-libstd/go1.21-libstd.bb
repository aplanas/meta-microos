SUMMARY = "Go compiled shared library libstd.so"
DESCRIPTION = "Go standard library compiled to a dynamically loadable shared object libstd.so"
LICENSE = "BSD-3-Clause"

PV = "1.21.0"

RPM_NAME = "go1.21-libstd-1.21.0-1.1.aarch64.rpm"
RPM_HASH = "3f251435998fac645d77eeb2f076728eadc537e488345f6676eeeafc6e56952d6967b4606aeffb129428bac859c0dbb6f314022d6712cad500b69dee865dc13f"

RPROVIDES:${PN} += "go-libstd \
go1.21-libstd \
libstd.so"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
