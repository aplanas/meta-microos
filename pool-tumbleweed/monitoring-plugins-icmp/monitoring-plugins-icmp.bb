SUMMARY = "Send ICMP packets to the specified host"
DESCRIPTION = "This plugin sends ICMP (ping) packets to the specified host. You can \
specify different RTA factors and acceptable packet loss. \
 \
Please read \
/usr/share/doc/packages/monitoring-plugins-icmp/README.SUSE-check_icmp \
for details how to setup this check."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-icmp-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "6f5794e8995b822591fe5fccce08983a8c687916101a2f55601ca97bc46e370026cd313a959997f4ee11607ed8fcedae610926a0ac43fdaf3d1eeb2c4688f425"

RPROVIDES:${PN} += "config-monitoring-plugins-icmp \
monitoring-plugins-icmp \
nagios-plugins-icmp"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
