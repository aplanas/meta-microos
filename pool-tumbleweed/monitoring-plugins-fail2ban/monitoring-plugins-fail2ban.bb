SUMMARY = "Check fail2ban server and how many IPs are currently banned"
DESCRIPTION = "This plugin checks if the fail2ban server is running and how many IPs are \
currently banned.  You can use this plugin to monitor all the jails or just a \
specific jail. \
 \
How to use \
---------- \
Just have to run the following command: \
  $ ./check_fail2ban --help"
LICENSE = "GPL-2.0-or-later"

PV = "1.0.2"

RPM_NAME = "monitoring-plugins-fail2ban-1.0.2-2.2.noarch.rpm"
RPM_HASH = "95c72c9d08c6ac88fda33866a385ecb4fe8d36865fdae333ec2e7f3640836533b8b75152172ecac5b67ae0a47f44b6e076d64ac151c5913a1e2a47e1064b0164"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "monitoring-plugins-fail2ban \
nagios-plugins-fail2ban"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
