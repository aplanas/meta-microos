SUMMARY = "Static PAPI libraries"
DESCRIPTION = "This package includes the static PAPI libraries."
LICENSE = "BSD-3-Clause"

PV = "7.0.0"

RPM_NAME = "papi_7_0_0-hpc-devel-static-7.0.0-1.4.aarch64.rpm"
RPM_HASH = "7bf0d3312319ed922c7e5986d298683f816373c0cff4f796c3064a33ac8aeb5ac436fb54bacd8d46ac523304ed9c49888576079528ca8fb4362ef9501cb72de9"

RPROVIDES:${PN} += "papi-7-0-0-hpc-devel-static"

RDEPENDS:${PN} += "linux-kernel-headers \
papi-7-0-0-hpc-devel"

inherit rpm
