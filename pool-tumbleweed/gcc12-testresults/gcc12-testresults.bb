SUMMARY = "Testsuite results"
DESCRIPTION = "Results from running the gcc and target library testsuites."
LICENSE = "SUSE-Public-Domain"

PV = "12.3.0+git1204"

RPM_NAME = "gcc12-testresults-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "b20344892ee3e19b69c06efbb13e9359650b54c798f3f2046b038106c9e40344615b83ad0f676326ce69ed60ae6a1fe0df46f8e21b90fb49c1f75303b672c10c"

RPROVIDES:${PN} += "gcc12-testresults \
gcc12-testresults(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
