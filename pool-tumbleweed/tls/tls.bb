SUMMARY = "Tcl Binding for the OpenSSL Library"
DESCRIPTION = "This Tcl extension provides a generic binding to OpenSSL, utilizing \
the Tcl_StackChannel API for Tcl 8.2 and higher. The sockets behave \
exactly the same as channels created using Tcl's built-in socket \
command with additional options for controlling the SSL session."
LICENSE = "BSD-3-Clause"

PV = "1.7.22"

RPM_NAME = "tls-1.7.22-2.6.aarch64.rpm"
RPM_HASH = "0ea8bd91192663a1fb778dc62cc165c2f41a4d8ee5567de51a5bcf6cc462b0915b9b060a3913244f729677f4935b6b70b71d73419d57556df31c95240b53a839"

RPROVIDES:${PN} += "tls \
tls(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
