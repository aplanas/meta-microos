SUMMARY = "TCL output module for rsyslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides an output module for TCL."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2212.0"

RPM_NAME = "rsyslog-module-omtcl-8.2212.0-2.5.aarch64.rpm"
RPM_HASH = "5836aa67dcfbd8b323c0667d094b0e9d628333a7d348dbd4c3dfaad6cf46f0e19882fce09054042650af729083ad6d43d1b6532597ea3c2bed72e35da4f8c745"

RPROVIDES:${PN} += "rsyslog-module-omtcl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
rsyslog"

inherit rpm
