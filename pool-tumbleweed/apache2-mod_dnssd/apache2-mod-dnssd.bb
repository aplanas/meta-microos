SUMMARY = "Apache2 module for Zeroconf support via DNS-SD"
DESCRIPTION = "mod_dnssd is an Apache HTTPD module which adds Zeroconf support via \
DNS-SD using Avahi."
LICENSE = "Apache-2.0"

PV = "0.6"

RPM_NAME = "apache2-mod_dnssd-0.6-29.13.aarch64.rpm"
RPM_HASH = "30395252591296dc1aef553de957bce9e385739c908ef236a573a9f5ddc58b9db54411470b3b1c2685cba70a0369397f7bcf593f9c1486ebf0d755eee5e367e7"

RPROVIDES:${PN} += "apache2-mod-dnssd"

RDEPENDS:${PN} += "apache-mmn-20120211 \
ld-linux-aarch64.so.1 \
libapr-1.so.0 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
suse-maintenance-mmn-0"

inherit rpm
