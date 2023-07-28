SUMMARY = "Diagnostic tools"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This package provides additional diagnostic tools (small helpers, \
usually not needed)."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2306.0"

RPM_NAME = "rsyslog-diag-tools-8.2306.0-1.1.aarch64.rpm"
RPM_HASH = "3ad0521e0a75336fa8087086dda6149ed3fa0b2d89d7a1a4391961d0e102de8b68f367b9e8c8cae02ac637c601377e8142500170feb28097aade4fdde95a89ce"

RPROVIDES:${PN} += "rsyslog-diag-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
rsyslog"

inherit rpm
