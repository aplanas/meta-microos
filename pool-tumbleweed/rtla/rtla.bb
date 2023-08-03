SUMMARY = "Real-Time Linux Analysis tools"
DESCRIPTION = "The rtla is a meta-tool that includes a set of commands that \
aims to analyze the real-time properties of Linux. But, instead of \
testing Linux as a black box, rtla leverages kernel tracing \
capabilities to provide precise information about the properties \
and root causes of unexpected results."
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "rtla-6.4.6-5.10.aarch64.rpm"
RPM_HASH = "3f85a9dbf6b7fab457dd1a4c0730183582b86f9aa4e9ea1e3c3561ce95442da92a185ec2efffd97f37629127cd4db48a22e9492b6bd536d1fdff66dd5238d34c"

RPROVIDES:${PN} += "rtla"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtraceevent.so.1 \
libtracefs.so.1"

inherit rpm
