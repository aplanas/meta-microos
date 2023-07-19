SUMMARY = "Real-Time Linux Analysis tools"
DESCRIPTION = "The rtla is a meta-tool that includes a set of commands that \
aims to analyze the real-time properties of Linux. But, instead of \
testing Linux as a black box, rtla leverages kernel tracing \
capabilities to provide precise information about the properties \
and root causes of unexpected results."
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "rtla-6.4.3-5.8.aarch64.rpm"
RPM_HASH = "9946f2d4c4b9fc7797c1af8616232d6ba932e7c511b3ddc2bb976cc0b402b2ae9e53b3173c9db2d286e65d340e5911548eecb664754758807c22cdb8475d3a1b"

RPROVIDES:${PN} += "rtla"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtraceevent.so.1 \
libtracefs.so.1"

inherit rpm
