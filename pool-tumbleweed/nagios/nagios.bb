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

RPM_NAME = "nagios-4.4.7-2.5.aarch64.rpm"
RPM_HASH = "662f3545cee3e0ef9137462a7a662b9c8e85ec36ae28e44678823561d7c9edee70ce37f9725f42c478fc5da8c54f0004e341cd0742c880026644ab96bd72bd6d"

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
