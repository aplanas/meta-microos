SUMMARY = "Write Stackdriver plugin for collectd"
DESCRIPTION = "Optional collectd plugin to to write to Google Stackdriver."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-write_stackdriver-5.12.0.134.g4cebbfc-1.6.aarch64.rpm"
RPM_HASH = "e02ff4867c79e02241a6378e0d8d70b0ded04b826323436a524d0713a2122203c03cc854b6b386bdf319189391e6d5081729c7523c04a52bae9613985e3604b2"

RPROVIDES:${PN} += "collectd-plugin-write-stackdriver"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libyajl.so.2"

inherit rpm
