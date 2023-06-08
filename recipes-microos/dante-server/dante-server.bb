SUMMARY = "A SOCKS v4/v5 server implementation"
DESCRIPTION = "This package contains the socks proxy daemon and its documentation. The \
sockd is the server part of the Dante socks proxy package and allows \
socks clients to connect through it to the network."
LICENSE = "BSD-3-Clause"

PV = "1.4.3"

RPM_NAME = "dante-server-1.4.3-2.8.aarch64.rpm"
RPM_HASH = "d5cd0734420912e8ec77dd3345b16947d7c97fcf99db9cf18c66609ea9d5c2256ed13e897df5e81d8beaa366545fd5a661a4c121b1667523f18698da9e8fe5e6"

RPROVIDES:${PN} += "config(dante-server) dante-server dante-server(aarch-64) dantesrv"
RDEPENDS:${PN} += "/bin/sh dante ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcom_err.so.2()(64bit) libcrypt.so.1()(64bit) libcrypt.so.1(XCRYPT_2.0)(64bit) libgssapi_krb5.so.2()(64bit) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libminiupnpc.so.17()(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) libwrap.so.0()(64bit) systemd"

inherit rpm
