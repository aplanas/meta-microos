SUMMARY = "Connectivity plugin for collectd"
DESCRIPTION = "Optional collectd plugin to collect Event-based interface status."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-connectivity-5.12.0.134.g4cebbfc-1.6.aarch64.rpm"
RPM_HASH = "720d35772ce04c33cbc7807136390a92f7d5bd56f211e529eb390530bc73eed6ef2fe54d1a479a470b06e1b5b98c0d641a6e5b840d5b201c84ff9d358ccc9f93"

RPROVIDES:${PN} += "collectd-plugin-connectivity"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmnl.so.0 \
libyajl.so.2"

inherit rpm
