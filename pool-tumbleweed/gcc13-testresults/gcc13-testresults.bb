SUMMARY = "Testsuite results"
DESCRIPTION = "Results from running the gcc and target library testsuites."
LICENSE = "SUSE-Public-Domain"

PV = "13.1.1+git7552"

RPM_NAME = "gcc13-testresults-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "8a53f85653f0262684f7317e8a684fb955727a8cbee4207a3a7f34248fe8dccfc994b3855fe17e01f3041a06f87ccb985414f9c90d2ea6bcb756b6a240647585"

RPROVIDES:${PN} += "gcc13-testresults"

RDEPENDS:${PN} += ""

inherit rpm
