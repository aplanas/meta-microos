SUMMARY = "The GNU C++ Compiler"
DESCRIPTION = "This package contains the GNU compiler for C++."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "gcc12-c++-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "fd91f69cb26b538e5da3c23e0c11c667364802367f931e6a0034bd46959b8370797e6ed8168b89c2d6ca69f78123b0a6cb9575979770319eb0c8e0f3830f5934"

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
