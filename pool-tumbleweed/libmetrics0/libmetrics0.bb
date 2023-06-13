SUMMARY = "Virtual Host Metrics Daemon (vhostmd)"
DESCRIPTION = "vhostmd provides a 'metrics communication channel' between a host and \
its hosted virtual machines, allowing limited introspection of host \
resource usage from within virtual machines."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1"

RPM_NAME = "libmetrics0-1.1-5.6.aarch64.rpm"
RPM_HASH = "ee1f1bbe65664db1d28344da3af08992f44dc04b8d70cdd1a1277330f8450a6d08e389cd3c0cd7442371ea2decb0f85b9123a1f4e6020329f29ee6b0ce6e6a90"

RPROVIDES:${PN} += "libmetrics.so.0()(64bit) \
libmetrics0 \
libmetrics0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
