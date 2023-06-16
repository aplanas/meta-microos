SUMMARY = "The Nagios Network Monitor"
DESCRIPTION = "Nagios is a program that will monitor hosts and services on your \
network. It has the ability to email or page you when a problem arises \
and when a problem is resolved. Nagios is written in C and is designed \
to run under Linux (and some other *NIX variants) as a background \
process, intermittently running checks on various services that you \
specify. \
 \
The actual service checks are performed by separate 'plugin' programs \
which return the status of the checks to Nagios. The plugins are \
available at http://sourceforge.net/projects/nagiosplug \
 \
This package provides core programs for Nagios. The web interface, \
documentation, and development files are built as separate packages"
LICENSE = "GPL-2.0-or-later"

PV = "4.4.7"

RPM_NAME = "nagios-4.4.7-2.4.aarch64.rpm"
RPM_HASH = "b582b31eb2520782d2c88e1ff6d4316e937c377ed51ece4ef0a37fadc985cb62c25a24758fb32ae17707967a154ccab9fe9e5fd181b16e1b594379a048c49d99"

RPROVIDES:${PN} += "config-nagios \
monitoring-daemon \
nagios"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/logger \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
coreutils \
fillup \
grep \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libssl.so.3 \
mailx \
permissions \
sed \
shadow"

inherit rpm
