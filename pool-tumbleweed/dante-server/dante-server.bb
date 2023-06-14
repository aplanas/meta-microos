SUMMARY = "A SOCKS v4/v5 server implementation"
DESCRIPTION = "This package contains the socks proxy daemon and its documentation. The \
sockd is the server part of the Dante socks proxy package and allows \
socks clients to connect through it to the network."
LICENSE = "BSD-3-Clause"

PV = "1.4.3"

RPM_NAME = "dante-server-1.4.3-2.8.aarch64.rpm"
RPM_HASH = "d5cd0734420912e8ec77dd3345b16947d7c97fcf99db9cf18c66609ea9d5c2256ed13e897df5e81d8beaa366545fd5a661a4c121b1667523f18698da9e8fe5e6"

RPROVIDES:${PN} += "config-dante-server \
dante-server \
dantesrv"

RDEPENDS:${PN} += "/bin/sh \
dante \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libcrypt.so.1 \
libgssapi-krb5.so.2 \
libm.so.6 \
libminiupnpc.so.17 \
libpam.so.0 \
libwrap.so.0 \
systemd"

inherit rpm
