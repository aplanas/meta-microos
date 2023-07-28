SUMMARY = "HDFS via HTTP output module for syslog"
DESCRIPTION = "Rsyslog is an enhanced multi-threaded syslog daemon. See rsyslog \
package. \
 \
This module provides support to output to HDFS via HTTP."
LICENSE = "Apache-2.0 & GPL-3.0-or-later"

PV = "8.2306.0"

RPM_NAME = "rsyslog-module-omhttpfs-8.2306.0-1.1.aarch64.rpm"
RPM_HASH = "4bed35660938e0b1b641e46319ad7d9b5504ba622f7b77b09074967316055c3357c63ea9294b4c3d295d0e749f060abb8aed28f475b46568041109039b2d48bc"

RPROVIDES:${PN} += "rsyslog-module-omhttpfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libfastjson.so.4 \
rsyslog"

inherit rpm
