SUMMARY = "Testsuite results"
DESCRIPTION = "Results from running the gcc and target library testsuites."
LICENSE = "SUSE-Public-Domain"

PV = "13.2.1+git7683"

RPM_NAME = "gcc13-testresults-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "d0e7284f51a87ee7df270cc79a9140b33a43818277d31a941528bf77090dbee41ac93cdf76136dbb560c2e2699ed459719798a3769d6654770f6afc179ac25d2"

RPROVIDES:${PN} += "gcc13-testresults"

RDEPENDS:${PN} += ""

inherit rpm
