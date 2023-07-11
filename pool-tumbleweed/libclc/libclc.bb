SUMMARY = "OpenCL C programming language library"
DESCRIPTION = "Library requirements of the OpenCL C programming language."
LICENSE = "Apache-2.0-with-LLVM-exception & (BSD-3-Clause | MIT)"

PV = "0.2.0+llvm16.0.0"

RPM_NAME = "libclc-0.2.0+llvm16.0.0-1.3.noarch.rpm"
RPM_HASH = "83758f68cc587f962679e82673614d09f0a6e611497b7209e5f9d8e410a1a032390a50138588f34f1ebf37afce03d952d4ee32b59b7846b4479b4c60814bb63a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libclc \
libclc-llvm16 \
pkgconfig-libclc"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
