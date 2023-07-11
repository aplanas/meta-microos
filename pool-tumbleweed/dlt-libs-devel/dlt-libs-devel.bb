SUMMARY = "DLT - Diagnostic Log and Trace: Development files"
DESCRIPTION = "DLT - Diagnostic Log and Trace: Development files."
LICENSE = "MPL-2.0-no-copyleft-exception"

PV = "2.18.8"

RPM_NAME = "dlt-libs-devel-2.18.8-4.5.aarch64.rpm"
RPM_HASH = "441995be7360bc5ca02c7e60b7ac75ea7c5c8ed3e5928167a36d031c2f292752e492d6b397804d405cb9c176e78ce956b90e17c9b1dbdadf9405b7bae093b3d1"

RPROVIDES:${PN} += "cmake-automotive-dlt \
dlt-libs-devel \
pkgconfig-automotive-dlt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
dlt-libs"

inherit rpm
