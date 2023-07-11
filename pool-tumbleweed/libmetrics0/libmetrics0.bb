SUMMARY = "Virtual Host Metrics Daemon (vhostmd)"
DESCRIPTION = "vhostmd provides a 'metrics communication channel' between a host and \
its hosted virtual machines, allowing limited introspection of host \
resource usage from within virtual machines."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1"

RPM_NAME = "libmetrics0-1.1-5.7.aarch64.rpm"
RPM_HASH = "bf860dfb3d4ae801a8b6e037eb7f07caa2fe1d4e09ccba79be4a409ab3b5433505e2f9d4ec0b86ebcc34d771674ac91c6bf64442e88047ae96843b4fe83bf07c"

RPROVIDES:${PN} += "libmetrics.so.0 \
libmetrics0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2"

inherit rpm
