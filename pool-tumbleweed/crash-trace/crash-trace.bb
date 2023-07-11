SUMMARY = "The trace command for crash"
DESCRIPTION = "This extension implements the 'trace' command for the crash tool."
LICENSE = "GPL-2.0-or-later"

PV = "3.0"

RPM_NAME = "crash-trace-3.0-2.3.aarch64.rpm"
RPM_HASH = "ced6709fafdc7c8890c042136c43e4506d5433b0dda3ced8a39e05c235b94b397e7bc090c9bf3496d49f397ac1e53c6255dc1909558c293771d9c7fac811e00c"

RPROVIDES:${PN} += "crash-trace"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
trace-cmd"

inherit rpm
