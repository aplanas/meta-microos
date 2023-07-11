SUMMARY = "Go compiled shared library libstd.so"
DESCRIPTION = "Go standard library compiled to a dynamically loadable shared object libstd.so"
LICENSE = "BSD-3-Clause"

PV = "1.20.5"

RPM_NAME = "go1.20-libstd-1.20.5-1.1.aarch64.rpm"
RPM_HASH = "051e098df9b6eebebeb478511cedd02a068ac5dad7318a9aba7c3f64ce38061c96625e663912aea39e94a3563d4b8b30fc0b9223ee2f0aa2e2efb9f2fbb255c7"

RPROVIDES:${PN} += "go-libstd \
go1.20-libstd \
libstd.so"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
