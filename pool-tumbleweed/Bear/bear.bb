SUMMARY = "Tool to generate compilation database for clang tooling"
DESCRIPTION = "Bear is a tool to generate compilation database for clang tooling. \
 \
One way to get compilation database is to use cmake as build tool. When the \
project compiles with no cmake, but another build system, there is no free json \
file. Bear is a tool to generate such file during the build process."
LICENSE = "GPL-3.0-or-later"

PV = "3.0.20"

RPM_NAME = "Bear-3.0.20-1.5.aarch64.rpm"
RPM_HASH = "6ded759b9cdb05a31d4c84dd61c706c50a7d4d4a5acb2aca2d8c9e8f8729ce9e0cf80698765fccb1a58479c5ec897569bc5101b6310165b27d5583d4d793919a"

RPROVIDES:${PN} += "Bear \
Bear(aarch-64) \
libexec.so()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libabsl_synchronization.so.2206.0.0()(64bit) \
libc.so.6()(64bit) \
libfmt.so.9()(64bit) \
libgcc_s.so.1()(64bit) \
libgrpc++.so.1.50()(64bit) \
libprotobuf-3.21.9.so()(64bit) \
libspdlog.so.1.11()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
