SUMMARY = "Virtual Host Metrics Daemon (vhostmd)"
DESCRIPTION = "vhostmd provides a 'metrics communication channel' between a host and \
its hosted virtual machines, allowing limited introspection of host \
resource usage from within virtual machines."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1"

RPM_NAME = "vhostmd-1.1-5.7.aarch64.rpm"
RPM_HASH = "ba24159c39142b050fb7649ff50e8d70f075fa635ef2bfff114ef54f28d84e3b662c020cb18b0eacd9e59e662dcf88782aa7f2179948251c0a5048a7ca187cc0"

RPROVIDES:${PN} += "config-vhostmd \
vhostmd"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libvirt.so.0 \
libxml2.so.2"

inherit rpm
