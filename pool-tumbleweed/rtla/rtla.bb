SUMMARY = "Real-Time Linux Analysis tools"
DESCRIPTION = "The rtla is a meta-tool that includes a set of commands that \
aims to analyze the real-time properties of Linux. But, instead of \
testing Linux as a black box, rtla leverages kernel tracing \
capabilities to provide precise information about the properties \
and root causes of unexpected results."
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "rtla-6.3.9-5.6.aarch64.rpm"
RPM_HASH = "47854a479516e9127e01ebb0477c42f26d7ebf9449027d2851dba4f78059e3ac7646424150b26f613adb1b49f9995b4cb20935dac5c7a84eac503ede69483005"

RPROVIDES:${PN} += "rtla"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtraceevent.so.1 \
libtracefs.so.1"

inherit rpm
