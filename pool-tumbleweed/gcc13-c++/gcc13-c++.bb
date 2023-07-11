SUMMARY = "The GNU C++ Compiler"
DESCRIPTION = "This package contains the GNU compiler for C++."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "gcc13-c++-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "4a84ab1cc955e1c9827ac06eb577e3e74a433ddc06dd59283d0d86116527d90e23b355d2ea5f8f920e7263d4168b5a8ec5d953567b8300a7a300b301612fd37b"

RPROVIDES:${PN} += "gcc13-c++"

RDEPENDS:${PN} += "gcc13 \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libmpc.so.3 \
libmpfr.so.6 \
libstdc++6-devel-gcc13 \
libz.so.1 \
libzstd.so.1"

inherit rpm
