SUMMARY = "DLT - Diagnostic Log and Trace: Development files"
DESCRIPTION = "DLT - Diagnostic Log and Trace: Development files."
LICENSE = "MPL-2.0-no-copyleft-exception"

PV = "2.18.8"

RPM_NAME = "dlt-libs-devel-2.18.8-4.4.aarch64.rpm"
RPM_HASH = "8d50030655d32adf4474c4a7b13a988a3f0b5e4e641c8c5818e7e21bca6073693b8de9322ad9d84f2ea203bd59a4e16c9e0d8ec9f64a2995e2759e793de73cbd"

RPROVIDES:${PN} += "cmake-automotive-dlt \
dlt-libs-devel \
pkgconfig-automotive-dlt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
dlt-libs"

inherit rpm
