SUMMARY = "Connectivity plugin for collectd"
DESCRIPTION = "Optional collectd plugin to collect Event-based interface status."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-connectivity-5.12.0.134.g4cebbfc-1.4.aarch64.rpm"
RPM_HASH = "1d8501be8d654d83c681f8edb5eb442767ae9286b6c25595983b21f27a69971a5917e64a9db5e3f838a70bd4534989689f32bc5a5a4d102a7a58304cefa1331b"

RPROVIDES:${PN} += "collectd-plugin-connectivity"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmnl.so.0 \
libyajl.so.2"

inherit rpm
