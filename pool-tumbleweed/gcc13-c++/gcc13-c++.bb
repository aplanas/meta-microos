SUMMARY = "The GNU C++ Compiler"
DESCRIPTION = "This package contains the GNU compiler for C++."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7597"

RPM_NAME = "gcc13-c++-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "0377dfaba379c5e546f7a00d18f29f3677dac0afd0d57ddbcc756177aee3fa178f0ce7558b53ab81b3329a753af01436122a777f1a513999afd57c2dcb3e1d6f"

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
