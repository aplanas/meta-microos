SUMMARY = "Development files for cxxopts"
DESCRIPTION = "CXXOpts is a C++ option parser library supporting single-letter options \
with a single dash, and long options with a double-dash. \
(There are some corner cases in 3.0.0 where behavior is not exactly \
matching GNU getopt or POSIX mode.) \
It requires and makes use of C++11 <regex>."
LICENSE = "MIT"

PV = "3.1.1"

RPM_NAME = "cxxopts-devel-3.1.1-1.1.aarch64.rpm"
RPM_HASH = "d4f9f00c223819fd3a31e5b6fee1150bcd71973479e5c130599bbcccf889dfe3a3c6b3f7aaeeb22bee3d63743c1d29b42ac7700e96b14ea5112087e2128cf6f5"

RPROVIDES:${PN} += "cmake(cxxopts) \
cxxopts-devel \
cxxopts-devel(aarch-64) \
pkgconfig(cxxopts)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libstdc++-devel"

inherit rpm
