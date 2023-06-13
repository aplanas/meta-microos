SUMMARY = "Go compiled shared library libstd.so"
DESCRIPTION = "Go standard library compiled to a dynamically loadable shared object libstd.so"
LICENSE = "BSD-3-Clause"

PV = "1.20.4"

RPM_NAME = "go1.20-libstd-1.20.4-1.1.aarch64.rpm"
RPM_HASH = "f936e3e5750906403d141840fda76517ec04fe26e3a1330dc83a98da0397e2c742c9ef43f4a8ac0f7a4f15c60f389df9afb926abc1a68300c94edd30f8dc5bad"

RPROVIDES:${PN} += "go-libstd \
go1.20-libstd \
go1.20-libstd(aarch-64) \
libstd.so()(64bit)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
