SUMMARY = "Lighttpd module to feed rrdtool databases"
DESCRIPTION = "RRD_tool is a system to store and display time-series data (i.e. \
network bandwidth, machine-room temperature, server load average). \
 \
This module feeds an rrdtool database with the traffic stats from \
lighttpd."
LICENSE = "BSD-3-Clause"

PV = "1.4.71"

RPM_NAME = "lighttpd-mod_rrdtool-1.4.71-1.1.aarch64.rpm"
RPM_HASH = "c0baf4d9956315b58d7d39bd383ec46c742c1378cb53e27b444339ad981cf543ebafd6afee2a98f659bef3017c34231ea2cc1249e7da4bec74b5467c940c227e"

RPROVIDES:${PN} += "config-lighttpd-mod-rrdtool \
lighttpd-mod-rrdtool"

RDEPENDS:${PN} += "libc.so.6 \
lighttpd \
rrdtool"

inherit rpm
