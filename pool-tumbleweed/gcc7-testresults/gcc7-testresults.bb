SUMMARY = "Testsuite results"
DESCRIPTION = "Results from running the gcc and target library testsuites."
LICENSE = "SUSE-Public-Domain"

PV = "7.5.0+r278197"

RPM_NAME = "gcc7-testresults-7.5.0+r278197-14.2.aarch64.rpm"
RPM_HASH = "f6c6c52d4efe751a22228f32c330c50a47f54b6e6faa970e3368acbb736aab48e2a963a2c59424b63d4cf8d7645a003a4df9bab3a3f15c957b381bfed96b2c0d"

RPROVIDES:${PN} += "gcc7-testresults"

RDEPENDS:${PN} += ""

inherit rpm
