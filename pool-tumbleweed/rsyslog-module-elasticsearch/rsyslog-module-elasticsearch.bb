SUMMARY = "ElasticSearch output module for syslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides support to output to an ElasticSearch database."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2306.0"

RPM_NAME = "rsyslog-module-elasticsearch-8.2306.0-1.1.aarch64.rpm"
RPM_HASH = "e00baf0b15defb88e3cedf2f14502aa0c07ab0b4c116023783d7d7e4c67f69ca89c02e0b4569632a7eb0df6d914adc36c91191bdfcc06f1086f2600624a173a0"

RPROVIDES:${PN} += "rsyslog-module-elasticsearch"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
rsyslog"

inherit rpm
