SUMMARY = "SBLIM Base Instrumentation (test suite)"
DESCRIPTION = "Test suite for the Standards Based Linux Instrumentation Base Providers"
LICENSE = "EPL-1.0"

PV = "1.6.4"

RPM_NAME = "sblim-cmpi-base-testsuite-1.6.4-7.15.aarch64.rpm"
RPM_HASH = "5a533047748015e645c59fdaf854455320268ee6ca360ab4606856136f7744fce5a28d3552c58715d53c8bca4ef1092cc8ba84a2469768a11cf3e94bdfb102b8"

RPROVIDES:${PN} += "sblim-cmpi-base-testsuite \
sblim-cmpi-base-testsuite(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/perl \
sblim-cmpi-base \
sblim-testsuite"

inherit rpm
