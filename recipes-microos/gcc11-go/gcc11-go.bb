SUMMARY = "GNU Go Compiler"
DESCRIPTION = "This package contains a Go compiler and associated development \
files based on the GNU GCC technology."
LICENSE = "GPL-3.0-or-later"

PV = "11.3.1+git2076"

RPM_NAME = "gcc11-go-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "f019747d77825b775825318fd48a34bb9cac46fb762c8c5ec5a5c9eedc7eb001bc09966820021543c01cb05f2e8b4499dc76a9f56999c7c0a49e467c4700c4e5"

RPROVIDES:${PN} += "gcc11-go gcc11-go(aarch-64)"
RDEPENDS:${PN} += "gcc11 libc.so.6(GLIBC_2.34)(64bit) libgmp.so.10()(64bit) libgo.so.19()(64bit) libgo19 libisl.so.23()(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libz.so.1()(64bit) libzstd.so.1()(64bit)"

inherit rpm
