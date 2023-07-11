SUMMARY = "The GNU C++ Compiler"
DESCRIPTION = "This package contains the GNU compiler for C++."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "gcc12-c++-12.3.0+git1204-1.33.aarch64.rpm"
RPM_HASH = "549f07153db66ac555cd052ad78e1e9dbb8b4f367b73ca0ccf2337b5420b4288c905b0f7bec1c78c877bd0f9b30e78c8d820f2859c16b78bd16e0db98245c658"

RPROVIDES:${PN} += "gcc12-c++"

RDEPENDS:${PN} += "gcc12 \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libmpc.so.3 \
libmpfr.so.6 \
libstdc++6-devel-gcc12 \
libz.so.1 \
libzstd.so.1"

inherit rpm
