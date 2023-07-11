SUMMARY = "Python3 API for collectd"
DESCRIPTION = "Optional collectd Python3 API in order to write collectd plugins in \
Python3."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-python3-5.12.0.134.g4cebbfc-1.6.aarch64.rpm"
RPM_HASH = "3eb0f4f39c76408ef9837fc57548acf9429d2030af5cec460fdf2d6fa26c35c6ab339c0d000c976322ec9758b080e11c35c2f573b35a068466290e1b58144cbc"

RPROVIDES:${PN} += "collectd-plugin-python3"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.11.so.1.0"

inherit rpm
