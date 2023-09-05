SUMMARY = "Real-Time Linux Analysis tools"
DESCRIPTION = "The rtla is a meta-tool that includes a set of commands that \
aims to analyze the real-time properties of Linux. But, instead of \
testing Linux as a black box, rtla leverages kernel tracing \
capabilities to provide precise information about the properties \
and root causes of unexpected results."
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "rtla-6.4.12-5.14.aarch64.rpm"
RPM_HASH = "1feae00b8afba454d45790f746c589fbcf29ad00b50adb4e179c024e07f6f9e575677c9e07018f0811e1157dd3a586f69d562308ab0556a91ba4b42aeea4cd61"

RPROVIDES:${PN} += "rtla"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtraceevent.so.1 \
libtracefs.so.1"

inherit rpm
