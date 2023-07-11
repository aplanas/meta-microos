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

RPM_NAME = "nagios-www-dch-4.4.7-2.5.aarch64.rpm"
RPM_HASH = "4864adf77d3a9774a3362b2f5d3b914d0109f399fcc2b78dd9e09bc2ee1bc1f2b1c8a8e591c170f5cc83ad116a4bd096bc30212079214047923f17b06811087c"

RPROVIDES:${PN} += "nagios-www-dch"

RDEPENDS:${PN} += "/usr/bin/sh \
nagios-www"

inherit rpm
