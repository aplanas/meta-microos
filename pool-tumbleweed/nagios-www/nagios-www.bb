SUMMARY = "Provides the HTML and CGI files for the Nagios web interface"
DESCRIPTION = "Nagios is a program that will monitor hosts and services on your \
network. It has the ability to email or page you when a problem arises \
and when a problem is resolved. Nagios is written in C and is designed \
to run under Linux (and some other *NIX variants) as a background \
process, intermittently running checks on various services that you \
specify. \
 \
Several CGI programs are included with Nagios in order to allow you to \
view the current service status, problem history, notification history, \
and log file via the web. This package provides the HTML and CGI files \
for the Nagios web interface. In addition, HTML documentation is \
included in this package."
LICENSE = "GPL-2.0-or-later"

PV = "4.4.7"

RPM_NAME = "nagios-www-4.4.7-2.5.aarch64.rpm"
RPM_HASH = "0701a4d85cde30f0ae3df16e9dd41040573942dc7406a7d9a569566edbc205327053c923f829d38af70293e531ec0ffff99cfdc0d896d58fac553e211e8b4d0e"

RPROVIDES:${PN} += "config-nagios-www \
monitoring-webfrontend \
nagios-www"

RDEPENDS:${PN} += "/usr/bin/logger \
/usr/bin/perl \
/usr/bin/sh \
apache2 \
coreutils \
gawk \
gd \
grep \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgd.so.3 \
libm.so.6 \
mod-php-any \
nagios \
php \
sed \
shadow"

inherit rpm
