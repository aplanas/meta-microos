SUMMARY = "DBI Storage Plugin for collectd"
DESCRIPTION = "Optional collectd plugin to store sampling results into \
various databases as supported by libdbi."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-dbi-5.12.0.134.g4cebbfc-1.4.aarch64.rpm"
RPM_HASH = "f64c5c85de1952b45a783a98f12850f74f8083ba11fd4dd80d03644287c8c30864d1d3aeb6a7283ea5899ce925eae2f68b28e64f299ba252412a00db18736107"

RPROVIDES:${PN} += "collectd-plugin-dbi"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbi.so.3"

inherit rpm
