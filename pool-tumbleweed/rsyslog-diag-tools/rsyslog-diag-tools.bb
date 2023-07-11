SUMMARY = "Diagnostic tools"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This package provides additional diagnostic tools (small helpers, \
usually not needed)."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2212.0"

RPM_NAME = "rsyslog-diag-tools-8.2212.0-2.5.aarch64.rpm"
RPM_HASH = "9a64478804f33ead9df9ab5ee5a3cf74245d0422f3b701586dec0c226d9ec7a778cf9c6e3028d9af263395c003cb3f41f18cdd36280e5ec16ca1128cbd145ca9"

RPROVIDES:${PN} += "rsyslog-diag-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
rsyslog"

inherit rpm
