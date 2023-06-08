SUMMARY = "IPv4LL Service for Zeroconf and Bonjour"
DESCRIPTION = "avahi-autoipd is an implementation of Dynamic Configuration of IPv4 \
Link-Local Addresses. \
 \
avahi-autoipd doesn't depend on any other Avahi library, hence it makes \
sense to install it even if Avahi itself is not installed."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "avahi-autoipd-0.8-23.1.aarch64.rpm"
RPM_HASH = "da6d90f356ccfaee4448c8122578c60aeeeef39d222cbc2e671ff12201eb607ed1bd5bba8edf628ad5f4305287c35d08f864d4345b05091ef00b52859764f7a5"

RPROVIDES:${PN} += "avahi-autoipd avahi-autoipd(aarch-64) avahi:/usr/sbin/avahi-autoipd group(avahi-autoipd) user(avahi-autoipd)"
RDEPENDS:${PN} += "/bin/sh coreutils ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdaemon.so.0()(64bit) sysuser-shadow"

inherit rpm
