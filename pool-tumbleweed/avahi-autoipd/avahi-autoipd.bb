SUMMARY = "IPv4LL Service for Zeroconf and Bonjour"
DESCRIPTION = "avahi-autoipd is an implementation of Dynamic Configuration of IPv4 \
Link-Local Addresses. \
 \
avahi-autoipd doesn't depend on any other Avahi library, hence it makes \
sense to install it even if Avahi itself is not installed."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "avahi-autoipd-0.8-23.3.aarch64.rpm"
RPM_HASH = "030a2c0df7ec143f7313664ce27251ec6ffb4c638ea954631e9b6f4ecf0f286a5ab0d08950f43fc65923cd158a82514b96ab0372220ce6485030a018b7c56b23"

RPROVIDES:${PN} += "avahi-/usr/sbin/avahi-autoipd \
avahi-autoipd \
group-avahi-autoipd \
user-avahi-autoipd"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdaemon.so.0 \
sysuser-shadow"

inherit rpm
