SUMMARY = "A Monitoring Daemon for Maintaining High Availability Resources"
DESCRIPTION = "ldirectord is a stand-alone daemon for monitoring the services on real \
servers. Currently, HTTP, HTTPS, and FTP services are supported. \
ldirectord works with the heartbeat code (http://www.linux-ha.org/). \
 \
See `ldirectord -h` and linux-ha/doc/ldirectord for more information."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "4.12.0+git30.7fd7c8fa"

RPM_NAME = "ldirectord-4.12.0+git30.7fd7c8fa-1.2.aarch64.rpm"
RPM_HASH = "d5a9d48b5fdf6198cff28e5244324444935863cb4b7f0a193f968d657af015773eb9dc4ecaaaebd7a0db4eb470970aa7b00de74177d8dc04572f7a8122ed20d6"

RPROVIDES:${PN} += "config-ldirectord \
heartbeat-ldirectord \
ldirectord"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
ipvsadm \
logrotate \
perl-IO-Socket-INET6 \
perl-MailTools \
perl-Net-SSLeay \
perl-Socket6 \
perl-libwww-perl \
resource-agents \
systemd"

inherit rpm
