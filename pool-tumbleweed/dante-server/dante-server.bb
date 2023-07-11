SUMMARY = "A SOCKS v4/v5 server implementation"
DESCRIPTION = "This package contains the socks proxy daemon and its documentation. The \
sockd is the server part of the Dante socks proxy package and allows \
socks clients to connect through it to the network."
LICENSE = "BSD-3-Clause"

PV = "1.4.3"

RPM_NAME = "dante-server-1.4.3-2.9.aarch64.rpm"
RPM_HASH = "606b96a79c05ee62a615bc0e220a6d8cf4606f98777f014c5998d3109b9d798b7d653de71a3cd2da19b9cad3df7ffae63a199d0907d25fcb96ce3f7289e170f0"

RPROVIDES:${PN} += "config-dante-server \
dante-server \
dantesrv"

RDEPENDS:${PN} += "/usr/bin/sh \
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
