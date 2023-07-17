SUMMARY = "Real-Time Linux Analysis tools"
DESCRIPTION = "The rtla is a meta-tool that includes a set of commands that \
aims to analyze the real-time properties of Linux. But, instead of \
testing Linux as a black box, rtla leverages kernel tracing \
capabilities to provide precise information about the properties \
and root causes of unexpected results."
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "rtla-6.4.2-5.7.aarch64.rpm"
RPM_HASH = "1454cb084cd45df297b26726e9a47b713293dfd131b18710e4559c88a89df0cdb9b45fbaaff43829b936b17ec1e1dff6c70204c3e17dfe3074657d66405fd413"

RPROVIDES:${PN} += "rtla"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtraceevent.so.1 \
libtracefs.so.1"

inherit rpm
