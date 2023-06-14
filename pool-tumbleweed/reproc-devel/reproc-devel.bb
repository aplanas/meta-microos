SUMMARY = "Development files for reproc"
DESCRIPTION = "reproc (Redirected Process) is a cross-platform C/C++ library that simplifies starting, stopping and communicating with external programs. The main use case is executing command line applications directly from C or C++ code and retrieving their output. \
 \
This package holds the development files for reproc."
LICENSE = "MIT"

PV = "14.2.4"

RPM_NAME = "reproc-devel-14.2.4-3.1.aarch64.rpm"
RPM_HASH = "52fb1af46aa0fc206fa21f29f29ee01a961fc323961b39a0588411f0efab76524285ddfe6dbfe7188ed71329f96fae38ac99bff0e456b2013ddd291f61cf9fa9"

RPROVIDES:${PN} += "cmake-reproc \
cmake-reproc++ \
pkgconfig-reproc \
pkgconfig-reproc++ \
reproc-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libreproc++14 \
libreproc14"

inherit rpm
