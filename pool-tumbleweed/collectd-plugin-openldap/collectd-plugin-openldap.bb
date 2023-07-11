SUMMARY = "OpenLDAP plugin for collectd"
DESCRIPTION = "This plugin for collectd reads monitoring information \
from OpenLDAP's cn=Monitor subtree."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-openldap-5.12.0.134.g4cebbfc-1.6.aarch64.rpm"
RPM_HASH = "c684cd7eae772fb2108b8c7c9920718d6df1c327f1ce4e91420833355e7a4dc63f7141cc280b705fd2d97872948fd1f50cde55be43e8ef3e21da9af7e6dc6aca"

RPROVIDES:${PN} += "collectd-plugin-openldap"

RDEPENDS:${PN} += "collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libldap.so.2"

inherit rpm
