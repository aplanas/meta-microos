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

RPM_NAME = "restund-0.4.12-2.3.aarch64.rpm"
RPM_HASH = "e996c68e7520108ddbc606a63ad85d40bd14f5c0210bcab2d1b5e160f0159f9a5727b67156b8d1a7bad3f6a49531324e6490764f8987e37774b7e7e15fcf6f06"

RPROVIDES:${PN} += "config(restund) \
restund \
restund(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
libc.so.6()(64bit) \
libmariadb.so.3()(64bit) \
libmariadb.so.3(libmysqlclient_18)(64bit) \
libre.so.12()(64bit) \
shadow"

inherit rpm
