SUMMARY = "A Monitoring Daemon for Maintaining High Availability Resources"
DESCRIPTION = "ldirectord is a stand-alone daemon for monitoring the services on real \
servers. Currently, HTTP, HTTPS, and FTP services are supported. \
ldirectord works with the heartbeat code (http://www.linux-ha.org/). \
 \
See `ldirectord -h` and linux-ha/doc/ldirectord for more information."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "4.12.0+git30.7fd7c8fa"

RPM_NAME = "ldirectord-4.12.0+git30.7fd7c8fa-1.1.aarch64.rpm"
RPM_HASH = "cb24ab2606b0f1eed13c9a55e525337ab8d91876107a84d039c92169091695e82e19bf4a57d658b07e073a079ed1cc895257e487a0c0eb4ccd5952845cdf9ec6"

RPROVIDES:${PN} += "config(ldirectord) \
heartbeat-ldirectord \
ldirectord \
ldirectord(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
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
