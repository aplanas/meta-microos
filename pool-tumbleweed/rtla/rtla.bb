SUMMARY = "Real-Time Linux Analysis tools"
DESCRIPTION = "The rtla is a meta-tool that includes a set of commands that \
aims to analyze the real-time properties of Linux. But, instead of \
testing Linux as a black box, rtla leverages kernel tracing \
capabilities to provide precise information about the properties \
and root causes of unexpected results."
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "rtla-6.3.4-5.3.aarch64.rpm"
RPM_HASH = "39dbcda1af9b54c5a3fb3fa9758326a0a4b464c0ffb8dd27c936facc955f94103240dc8fc72667be99f12c2e3920d55a50483908c4f2101cd3c88f841c5b4dc1"

RPROVIDES:${PN} += "rtla"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtraceevent.so.1 \
libtracefs.so.1"

inherit rpm
