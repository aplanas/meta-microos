SUMMARY = "Send ICMP packets to the specified host"
DESCRIPTION = "This plugin sends ICMP (ping) packets to the specified host. You can \
specify different RTA factors and acceptable packet loss. \
 \
Please read \
/usr/share/doc/packages/monitoring-plugins-icmp/README.SUSE-check_icmp \
for details how to setup this check."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-icmp-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "0f5e5782afaa77eff08d391311ea263ac112afe203a06981e2a10e397d31e67330e01c23b8acdafbda116d52a47b1146eeac08e182165fa6487dc66f37ebd2e1"

RPROVIDES:${PN} += "config-monitoring-plugins-icmp \
monitoring-plugins-icmp \
nagios-plugins-icmp"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
