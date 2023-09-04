SUMMARY = "Real-Time Linux Analysis tools"
DESCRIPTION = "The rtla is a meta-tool that includes a set of commands that \
aims to analyze the real-time properties of Linux. But, instead of \
testing Linux as a black box, rtla leverages kernel tracing \
capabilities to provide precise information about the properties \
and root causes of unexpected results."
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "rtla-6.4.11-5.13.aarch64.rpm"
RPM_HASH = "e22e9c122ba3a06f37fa5486a1f53522f001014f023be7897ca12ccc9f5c044e778c32abb2a2c4d3244ed82b5aadbe23fb3fe2deb8143518c650851d1c2958c4"

RPROVIDES:${PN} += "rtla"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtraceevent.so.1 \
libtracefs.so.1"

inherit rpm
