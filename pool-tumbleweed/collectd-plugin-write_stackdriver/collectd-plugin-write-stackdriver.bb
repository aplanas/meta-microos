SUMMARY = "Write Stackdriver plugin for collectd"
DESCRIPTION = "Optional collectd plugin to to write to Google Stackdriver."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-write_stackdriver-5.12.0.134.g4cebbfc-1.4.aarch64.rpm"
RPM_HASH = "fb10406f158abf149b0fb71c4ae19929202ce51313bba1a6d2f3500eca334d3fbdd80c42e9078a6437ab8cd68749e96d7bb12f7c11a252cdac6ad5ffaf3dd8df"

RPROVIDES:${PN} += "collectd-plugin-write_stackdriver \
collectd-plugin-write_stackdriver(aarch-64)"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libcurl.so.4()(64bit) \
libyajl.so.2()(64bit)"

inherit rpm
