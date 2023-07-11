SUMMARY = "Testsuite results"
DESCRIPTION = "Results from running the gcc and target library testsuites."
LICENSE = "SUSE-Public-Domain"

PV = "12.3.0+git1204"

RPM_NAME = "gcc12-testresults-12.3.0+git1204-1.2.aarch64.rpm"
RPM_HASH = "7bc1664a5246c13b11c164e992f4ee576a3d1e909dc4c0fd4ef8893baf80e70daf8cea8a844e8eb8a8c01cd6170d20af18cf8168e21537ad2c0df4c9776c4136"

RPROVIDES:${PN} += "gcc12-testresults"

RDEPENDS:${PN} += ""

inherit rpm
