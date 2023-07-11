SUMMARY = "Modular STUN/TURN server"
DESCRIPTION = "Restund is a modular and flexible STUN and TURN Server with IPv4 and \
IPv6 support. \
The server is designed around the principle of a lightweight core \
using server modules to extend its functionality. \
 \
Some of the modules supported: \
 * Authentication module \
 * Binding module \
 * MySQL module \
 * Statistics module \
 * Status module \
 * Syslog module \
 * TURN module"
LICENSE = "BSD-3-Clause"

PV = "0.4.12"

RPM_NAME = "restund-0.4.12-2.4.aarch64.rpm"
RPM_HASH = "00be8ee736b79c2c891e914c16d7a8fb18e37f7b62cdedf5d47647343da5c6ee5a68fa215d12223f21e0f66e190692bca870ad165331385804f5ca8c0cf4bfac"

RPROVIDES:${PN} += "config-restund \
restund"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
libc.so.6 \
libmariadb.so.3 \
libre.so.12 \
shadow"

inherit rpm
