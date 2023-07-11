SUMMARY = "Apache2 module for Zeroconf support via DNS-SD"
DESCRIPTION = "mod_dnssd is an Apache HTTPD module which adds Zeroconf support via \
DNS-SD using Avahi."
LICENSE = "Apache-2.0"

PV = "0.6"

RPM_NAME = "apache2-mod_dnssd-0.6-29.14.aarch64.rpm"
RPM_HASH = "d9e5f1bbd30e7caf48013b391d1302854349a818dee59228684b2a74aafaaa517e2b397b91d6815e3a0c0ffe0448988f5f2c94a5cf9deafadcc570be0522eeee"

RPROVIDES:${PN} += "apache2-mod-dnssd"

RDEPENDS:${PN} += "apache-mmn-20120211 \
ld-linux-aarch64.so.1 \
libapr-1.so.0 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
suse-maintenance-mmn-0"

inherit rpm
