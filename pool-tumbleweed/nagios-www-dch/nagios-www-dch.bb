SUMMARY = "HTML and CGI files that do not call home"
DESCRIPTION = "Several CGI programs are included with Nagios in order to allow you to \
view the current service status, problem history, notification history, \
and log file via the web. \
 \
Since Version 3.1, some of those CGI files and the Nagios process itself \
try to detect the latest version and fetching news feeds from the upstream \
server www.nagios.org. \
 \
This additional package provides simply HTML files that do not 'call \
home' and also allow to run the web interface without PHP support. \
 \
There is also an offline version of the documentation included in this \
package. \
 \
Note: The HTML pages use 'side' and 'main' and frame targets."
LICENSE = "GPL-2.0-or-later"

PV = "4.4.7"

RPM_NAME = "nagios-www-dch-4.4.7-2.4.aarch64.rpm"
RPM_HASH = "68a3b7dae8f830628eb3e4620c28e2db9fb7181e0712139750daeb6a5011e0e29b49e510eb510def7c4761efb71965168ec5240d7a045659e48e86e213d071e0"

RPROVIDES:${PN} += "nagios-www-dch \
nagios-www-dch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
nagios-www"

inherit rpm
