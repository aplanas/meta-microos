SUMMARY = "DLT - Diagnostic Log and Trace: Development files"
DESCRIPTION = "DLT - Diagnostic Log and Trace: Development files."
LICENSE = "MPL-2.0-no-copyleft-exception"

PV = "2.18.8"

RPM_NAME = "dlt-libs-devel-2.18.8-4.6.aarch64.rpm"
RPM_HASH = "d8a685fbb3afa61c09b8e073187e566cddd5ceaebbca5c090481f6ed2fc82717ef43028d92e997a02c57698a6702c0a40266140cff99febfcee64ad337cc9922"

RPROVIDES:${PN} += "cmake-automotive-dlt \
dlt-libs-devel \
pkgconfig-automotive-dlt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
dlt-libs"

inherit rpm
