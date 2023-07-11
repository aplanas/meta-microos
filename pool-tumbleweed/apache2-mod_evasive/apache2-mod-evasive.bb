SUMMARY = "Denial of Service evasion module for Apache"
DESCRIPTION = "mod_evasive is an evasive maneuvers module for Apache to provide \
evasive action in the event of an HTTP DoS or DDoS attack or brute \
force attack. It is also designed to be a detection and network \
management tool, and can be easily configured to talk to ipchains, \
firewalls, routers, and etcetera. mod_evasive presently reports \
abuses via email and syslog facilities."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.1"

RPM_NAME = "apache2-mod_evasive-1.10.1-17.6.aarch64.rpm"
RPM_HASH = "aa100efd46fbf0ce9c9a967b8fea44713c672435124ca46dedb42f53b57793bb1522464d0cad67c13cfd134b0bccf7837d8b60348e37c0ff3ab4bbf950903fa7"

RPROVIDES:${PN} += "apache2-mod-evasive \
config-apache2-mod-evasive"

RDEPENDS:${PN} += "apache-mmn-20120211 \
apache2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
suse-maintenance-mmn-0"

inherit rpm
