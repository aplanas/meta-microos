SUMMARY = "TCL output module for rsyslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides an output module for TCL."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2306.0"

RPM_NAME = "rsyslog-module-omtcl-8.2306.0-1.1.aarch64.rpm"
RPM_HASH = "5095fe9bb85cba1530fcff89f67d16da2160e7054737a5a1c074d5c6c639264d3facadd408433f51f05cb935b238e2cde16acb5696d0648410bcb4b9e881f03b"

RPROVIDES:${PN} += "rsyslog-module-omtcl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
rsyslog"

inherit rpm
