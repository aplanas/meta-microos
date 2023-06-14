SUMMARY = "GDB testsuite results"
DESCRIPTION = "Results from running the GDB testsuite."
LICENSE = "SUSE-Public-Domain"

PV = "12.1"

RPM_NAME = "gdb-testresults-12.1-8.1.aarch64.rpm"
RPM_HASH = "45d6a21514ba8c9f94a3bdf7688d2e041aa1605d79619860c5e37c48a8896804e3fa6c42689f04acd909bf386d154b00e140c3dffa3f6a6241648307bcb755ab"

RPROVIDES:${PN} += "gdb-testresults"

RDEPENDS:${PN} += "/bin/sh \
python3-base"

inherit rpm
