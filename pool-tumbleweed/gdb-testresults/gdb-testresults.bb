SUMMARY = "GDB testsuite results"
DESCRIPTION = "Results from running the GDB testsuite."
LICENSE = "SUSE-Public-Domain"

PV = "13.2"

RPM_NAME = "gdb-testresults-13.2-2.1.aarch64.rpm"
RPM_HASH = "4420c4c2db5235987dbdbce3d8764f0e575194b965741004069d52a39ea84d3b9a447a1a658f6938c9afba0f022e464b3032661e3def4aca3065d6f993577fda"

RPROVIDES:${PN} += "gdb-testresults"

RDEPENDS:${PN} += "/usr/bin/sh \
python3-base"

inherit rpm
