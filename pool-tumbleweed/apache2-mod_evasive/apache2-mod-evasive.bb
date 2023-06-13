SUMMARY = "Denial of Service evasion module for Apache"
DESCRIPTION = "mod_evasive is an evasive maneuvers module for Apache to provide \
evasive action in the event of an HTTP DoS or DDoS attack or brute \
force attack. It is also designed to be a detection and network \
management tool, and can be easily configured to talk to ipchains, \
firewalls, routers, and etcetera. mod_evasive presently reports \
abuses via email and syslog facilities."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.1"

RPM_NAME = "apache2-mod_evasive-1.10.1-17.5.aarch64.rpm"
RPM_HASH = "51b24483e3723911df297625127b330a1c2848ac693be8693ac03aa200b27448fc076eea4b7ca9fb0bbb597971a799b39520bb087c9f84e71a73cf874dd00819"

RPROVIDES:${PN} += "apache2-mod_evasive \
apache2-mod_evasive(aarch-64) \
config(apache2-mod_evasive)"

RDEPENDS:${PN} += "apache2 \
apache_mmn_20120211 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
suse_maintenance_mmn_0"

inherit rpm
