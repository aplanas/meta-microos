SUMMARY = "The GNU C++ Compiler"
DESCRIPTION = "This package contains the GNU compiler for C++."
LICENSE = "GPL-3.0-or-later"

PV = "11.3.1+git2076"

RPM_NAME = "gcc11-c++-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "902397a15babd7b332150aa4638c65dbc7df692419372fcdb31a49c4ba2d4f8cb6caf2c9e716b28e6e558bc5c2ab7b22ab07a6b171d4ee9c469bb75f956b25e6"

RPROVIDES:${PN} += "gcc11-c++ gcc11-c++(aarch-64)"
RDEPENDS:${PN} += "gcc11 libc.so.6(GLIBC_2.34)(64bit) libgmp.so.10()(64bit) libisl.so.23()(64bit) libmpc.so.3()(64bit) libmpfr.so.6()(64bit) libstdc++6-devel-gcc11 libz.so.1()(64bit) libzstd.so.1()(64bit)"

inherit rpm
