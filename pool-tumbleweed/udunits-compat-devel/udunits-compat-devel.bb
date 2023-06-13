SUMMARY = "Udunits2 compatibility layer for udunits v1 API"
DESCRIPTION = "This package contains the files needed for compiling programs using \
the udunits2 compatibility library."
LICENSE = "MIT"

PV = "2.2.28"

RPM_NAME = "udunits-compat-devel-2.2.28-1.8.aarch64.rpm"
RPM_HASH = "8b0d8fa8a01fd0d902e958dda7881e2fc2919ff765231855bdf4d4f6be98ec629f5586dd7a2f749c2d856c7a6978f677ef9e0d3aa90c8b7ae82372264db6001f"

RPROVIDES:${PN} += "udunits-compat-devel \
udunits-compat-devel(aarch-64) \
udunits-devel"

RDEPENDS:${PN} += "udunits-compat \
udunits2-devel"

inherit rpm
