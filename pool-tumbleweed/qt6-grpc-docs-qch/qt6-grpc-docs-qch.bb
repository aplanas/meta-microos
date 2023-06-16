SUMMARY = "Documentation for qt6-grpc in QCH format"
DESCRIPTION = "This package contains documentation for qt6-grpc in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-grpc-docs-qch-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "6fc432419925b377b2161a00e2564312b95e8dd34e37fdfc80fa48b78c7c8c61d3e2c3fdcf771cb4321d78bb82eb5248e96bd376f003ce68e132e9b9aaab85f5"

RPROVIDES:${PN} += "qt6-grpc-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
