SUMMARY = "Development files for fdk-aac-free"
DESCRIPTION = "The libfdk-aac-devel package contains libraries and header files for \
developing applications that use fdk-aac-free."
LICENSE = "FDK-AAC"

PV = "2.0.0"

RPM_NAME = "libfdk-aac-devel-2.0.0-2.8.aarch64.rpm"
RPM_HASH = "ed94e65d6811c30ff9331e4b10ca8577fb391dd316a5ad7d92a6af718dbf080e429b4ac39b333f22bd8469e91afa5c5d36f149df84e89f988a49da2f535ffb89"

RPROVIDES:${PN} += "fdk-aac-free-devel \
libfdk-aac-devel \
pkgconfig-fdk-aac"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfdk-aac2"

inherit rpm
