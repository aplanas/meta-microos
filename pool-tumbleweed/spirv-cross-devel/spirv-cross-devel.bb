SUMMARY = "Development headers for the SPIRV-Cross library"
DESCRIPTION = "SPIRV-Cross is a tool and library designed for parsing and \
converting SPIR-V to other shader languages."
LICENSE = "Apache-2.0 | MIT"

PV = "1.3.243.0"

RPM_NAME = "spirv-cross-devel-1.3.243.0-1.2.aarch64.rpm"
RPM_HASH = "99b261d38ebaf52570dd95fe5dcbd83baab43b0146c672dde503317d11342e14f535e5bbdff9aeb45668b4875e4688f263bf6df6412641a210b9ec15a6aefe99"

RPROVIDES:${PN} += "libspirv-cross-c-shared-devel \
pkgconfig-spirv-cross-c-shared \
spirv-cross-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libspirv-cross-c-shared0"

inherit rpm
