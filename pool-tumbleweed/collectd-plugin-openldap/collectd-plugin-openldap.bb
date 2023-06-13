SUMMARY = "OpenLDAP plugin for collectd"
DESCRIPTION = "This plugin for collectd reads monitoring information \
from OpenLDAP's cn=Monitor subtree."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-openldap-5.12.0.134.g4cebbfc-1.4.aarch64.rpm"
RPM_HASH = "6a021848236c32e76fa671eecaee708b9924662f47d8e80ab6197f55272170c4f1cd56657bfc4d810f17f385fc3d675dd4c7d9f5e06e14bb3fb751c5abf8b17f"

RPROVIDES:${PN} += "collectd-plugin-openldap \
collectd-plugin-openldap(aarch-64)"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libldap.so.2()(64bit)"

inherit rpm
