SUMMARY = "DBI Storage Plugin for collectd"
DESCRIPTION = "Optional collectd plugin to store sampling results into \
various databases as supported by libdbi."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-dbi-5.12.0.134.g4cebbfc-1.6.aarch64.rpm"
RPM_HASH = "b2df1dabfcfad97fe831008da8138a56b435d2d4b3baf717e32fe1c603d9d2ec587e32efce6df57f81f44400d7adb4fa5bef8c1dd44bca6263eece28f3aa145a"

RPROVIDES:${PN} += "collectd-plugin-dbi"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbi.so.3"

inherit rpm
