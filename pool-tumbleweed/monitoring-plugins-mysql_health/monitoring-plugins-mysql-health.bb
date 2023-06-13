SUMMARY = "Check various parameters of a MySQL database"
DESCRIPTION = "When using a database that are business critical it can be a good idea to \
monitor the internals. \
 \
This Nagios plugin allows you to monitor the internal details of your \
MySQL database."
LICENSE = "GPL-2.0+"

PV = "3.0.0.5"

RPM_NAME = "monitoring-plugins-mysql_health-3.0.0.5-1.15.noarch.rpm"
RPM_HASH = "85a0ce08c772151c2280cc7ba6ce3c0c2158b1c470a543e9f1e876c1e404e944fa115335039a5c961f98fd41b3ac3d725e1b9ed5f33727aaeee70392f977f4fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "monitoring-plugins-mysql_health \
nagios-plugins-mysql_health"

RDEPENDS:${PN} += "/usr/bin/perl \
mysql-client"

inherit rpm
