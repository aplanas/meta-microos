SUMMARY = "Development files for the Qt 6 Test library"
DESCRIPTION = "Development files for the Qt 6 Test library."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-test-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "dcf6dbad98ddc5e4046bb93c15d2d168625c72dd905d662a868bb0e2892847ef40bb9117cd399d43c24584f5f26614f4562e30093cf288102fdb068ee49a4f8a"

RPROVIDES:${PN} += "cmake(Qt6Test) \
pkgconfig(Qt6Test) \
qt6-test-devel \
qt6-test-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake(Qt6Core) \
libQt6Test6 \
pkgconfig(Qt6Core)"

inherit rpm
