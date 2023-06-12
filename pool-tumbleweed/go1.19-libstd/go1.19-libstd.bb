SUMMARY = "Go compiled shared library libstd.so"
DESCRIPTION = "Go standard library compiled to a dynamically loadable shared object libstd.so"
LICENSE = "BSD-3-Clause"

PV = "1.19.9"

RPM_NAME = "go1.19-libstd-1.19.9-1.1.aarch64.rpm"
RPM_HASH = "b1768b03c6e9556cbdbdd751922dda07ba824f51808b4a2f8b707887b7bf132928781b50c128326075c810d2b07788efd17f261f4d3ba07e6e3c6369d7e8468f"

RPROVIDES:${PN} += "go-libstd \
go1.19-libstd \
go1.19-libstd(aarch-64) \
libstd.so()(64bit)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
