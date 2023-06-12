SUMMARY = "OpenCL C programming language library"
DESCRIPTION = "Library requirements of the OpenCL C programming language."
LICENSE = "Apache-2.0-WITH-LLVM-exception & (BSD-3-Clause | MIT)"

PV = "0.2.0+llvm16.0.0"

RPM_NAME = "libclc-0.2.0+llvm16.0.0-1.2.noarch.rpm"
RPM_HASH = "138c83a2a491aea89eda7670129c80ac8801097fb24e3aaaca0d93bed604f19a0e7a3efe901e8440d6ff79cb14bfb4e5ca364cefec69a1f1bd4193ca4eda642d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libclc \
libclc(llvm16) \
pkgconfig(libclc)"
RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
