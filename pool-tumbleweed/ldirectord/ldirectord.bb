SUMMARY = "A Monitoring Daemon for Maintaining High Availability Resources"
DESCRIPTION = "ldirectord is a stand-alone daemon for monitoring the services on real \
servers. Currently, HTTP, HTTPS, and FTP services are supported. \
ldirectord works with the heartbeat code (http://www.linux-ha.org/). \
 \
See `ldirectord -h` and linux-ha/doc/ldirectord for more information."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "4.12.0+git50.5c26404e"

RPM_NAME = "ldirectord-4.12.0+git50.5c26404e-1.1.aarch64.rpm"
RPM_HASH = "0b66fec4f4697bb74559b711ea5f506c510ed617fc5e1a92bf2a435677b1a147299e0f6272cbb3144ad2e75bb6ce557e78a700b42edf444b79c285c5716ee102"

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
