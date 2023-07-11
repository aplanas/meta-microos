SUMMARY = "HDFS via HTTP output module for syslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides support to output to HDFS via HTTP."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2212.0"

RPM_NAME = "rsyslog-module-omhttpfs-8.2212.0-2.5.aarch64.rpm"
RPM_HASH = "405bf820844348251ec6314488bc1cb962d6b2f3ad8281bcca1405bc29920fe92e868e14ace38df6008191cd80dc16a4e03cfa3a618ec611b2e128b2cbf9bf36"

RPROVIDES:${PN} += "rsyslog-module-omhttpfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libfastjson.so.4 \
rsyslog"

inherit rpm
