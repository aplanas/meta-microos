SUMMARY = "Additional documentation for rsyslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This package provides additional documentation for rsyslog."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2212.0"

RPM_NAME = "rsyslog-doc-8.2212.0-2.5.aarch64.rpm"
RPM_HASH = "35f1bbabb7692fc758fc4807cac2d23ade7856bacbf189e1cce94fd7d3006526494852ce19b5b6b4aa2f16db93893f96bf07d6ad15ae3369a087588b6458f367"

RPROVIDES:${PN} += "rsyslog-doc"

RDEPENDS:${PN} += ""

inherit rpm
