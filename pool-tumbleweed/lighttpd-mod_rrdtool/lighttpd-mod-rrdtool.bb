SUMMARY = "Lighttpd module to feed rrdtool databases"
DESCRIPTION = "RRD_tool is a system to store and display time-series data (i.e. \
network bandwidth, machine-room temperature, server load average). \
 \
This module feeds an rrdtool database with the traffic stats from \
lighttpd."
LICENSE = "BSD-3-Clause"

PV = "1.4.71"

RPM_NAME = "lighttpd-mod_rrdtool-1.4.71-1.2.aarch64.rpm"
RPM_HASH = "dc3714027abd1e0ee3fad2f5b783b2be23bde40ec5d4fd5570708236875b750d4dae0ea9b7185ed762280981ac946187670c93737f0ae1c49187b738a675a079"

RPROVIDES:${PN} += "config-lighttpd-mod-rrdtool \
lighttpd-mod-rrdtool"

RDEPENDS:${PN} += "libc.so.6 \
lighttpd \
rrdtool"

inherit rpm
