SUMMARY = "API Documentation for tclap-doc"
DESCRIPTION = " \
This package contains the API documentation for TCLAP, the Templatized \
C++ Command Line Parser."
LICENSE = "MIT"

PV = "1.2.5"

RPM_NAME = "tclap-doc-1.2.5-3.1.noarch.rpm"
RPM_HASH = "8bfb6482090981e6d946dec763b617f66f5d25e2b664a9cd7d2ad5deb317696a4364860b1c01d1c5d31fbc6ffce7013bea76e89edad1290faf386ed9a7422fc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tclap-doc"
RDEPENDS:${PN} += ""

inherit rpm
