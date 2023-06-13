SUMMARY = "Development files for MIT Kerberos5"
DESCRIPTION = "Kerberos V5 is a trusted-third-party network authentication system, \
which can improve network security by eliminating the insecure \
practice of cleartext passwords. This package includes Libraries and \
Include Files for Development"
LICENSE = "MIT"

PV = "1.20.1"

RPM_NAME = "krb5-devel-1.20.1-6.1.aarch64.rpm"
RPM_HASH = "ae2189a49eefe2033e44801bc465b0502f325b27c2cd2207a7052150cd86de44ff08964599f5d1b320e9c44b2c1fbbf7a7d238574c404b4109eeef4fa2bf395d"

RPROVIDES:${PN} += "krb5-devel \
krb5-devel(aarch-64) \
pkgconfig(gssrpc) \
pkgconfig(kadm-client) \
pkgconfig(kadm-server) \
pkgconfig(kdb) \
pkgconfig(krb5) \
pkgconfig(krb5-gssapi) \
pkgconfig(mit-krb5) \
pkgconfig(mit-krb5-gssapi)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
keyutils-devel \
krb5 \
pkgconfig(com_err) \
pkgconfig(gssrpc) \
pkgconfig(kdb) \
pkgconfig(libverto) \
pkgconfig(mit-krb5) \
pkgconfig(mit-krb5-gssapi) \
pkgconfig(ss)"

inherit rpm
