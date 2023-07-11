SUMMARY = "ElasticSearch output module for syslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides support to output to an ElasticSearch database."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2212.0"

RPM_NAME = "rsyslog-module-elasticsearch-8.2212.0-2.5.aarch64.rpm"
RPM_HASH = "9b3652f104da8c28213d8a8cf9f8e75946c9c69de60ee66a7282652af873e032c5839350ce1da0e3815e48f8a7b86f4e3075701e818186d556a2faf4f120a7df"

RPROVIDES:${PN} += "rsyslog-module-elasticsearch"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
rsyslog"

inherit rpm
