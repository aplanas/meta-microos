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

RPM_NAME = "restund-0.4.12-2.5.aarch64.rpm"
RPM_HASH = "ed641498bd14c3ac62decd0f4c30b68dd3dd01be79b442550a1235ec2f8648d3be4eaa947c47e6173d272a05101afcf6b3a9c1a1aa1a2da0c149e291c11f1a7e"

RPROVIDES:${PN} += "config-restund \
restund"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
libc.so.6 \
libmariadb.so.3 \
libre.so.16 \
shadow"

inherit rpm
