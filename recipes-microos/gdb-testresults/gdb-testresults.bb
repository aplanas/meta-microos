SUMMARY = "GDB testsuite results"
DESCRIPTION = "Results from running the GDB testsuite."
LICENSE = "SUSE-Public-Domain"

PV = "12.1"

RPM_NAME = "gdb-testresults-12.1-7.1.aarch64.rpm"
RPM_HASH = "45a2205e981a91fdf9f58bdec10d0fdb1532a3cf14181ba4b76c8b6152702d8efb7255cf5af2ca688635fb97f9fefc2073a37c678c704a4c3b040a484b9eefca"

RPROVIDES:${PN} += "gdb-testresults gdb-testresults(aarch-64)"
RDEPENDS:${PN} += "/bin/sh python3-base"

inherit rpm
