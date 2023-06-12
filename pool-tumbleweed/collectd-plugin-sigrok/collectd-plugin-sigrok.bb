SUMMARY = "Sigrok Monitoring Plugin for collectd"
DESCRIPTION = "Optional collectd plugin to collect measurements from \
various devices supported by libsigrok."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-sigrok-5.12.0.134.g4cebbfc-1.4.aarch64.rpm"
RPM_HASH = "25b760f44447cec16079381a8694a9d62553a6832e5cdaa03e8383495907766540c83d83d22488d20cb9126517fb9a2f45f0b5108931c40720303d064d11fc42"

RPROVIDES:${PN} += "collectd-plugin-sigrok \
collectd-plugin-sigrok(aarch-64)"
RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit) \
libsigrok.so.4()(64bit)"

inherit rpm
