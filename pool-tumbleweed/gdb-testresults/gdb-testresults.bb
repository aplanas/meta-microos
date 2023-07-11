SUMMARY = "GDB testsuite results"
DESCRIPTION = "Results from running the GDB testsuite."
LICENSE = "SUSE-Public-Domain"

PV = "13.2"

RPM_NAME = "gdb-testresults-13.2-1.1.aarch64.rpm"
RPM_HASH = "6bf3f53b099ee78841a94783700e1631d7c1d4a7574196a10fc9bae78fc29d96650fd7788fa2f3e4cdcca65f4aff32add5b5827f9b9f9d63cec412775502cba7"

RPROVIDES:${PN} += "gdb-testresults"

RDEPENDS:${PN} += "/usr/bin/sh \
python3-base"

inherit rpm
