SUMMARY = "Development files for MIT Kerberos5"
DESCRIPTION = "Kerberos V5 is a trusted-third-party network authentication system, \
which can improve network security by eliminating the insecure \
practice of cleartext passwords. This package includes Libraries and \
Include Files for Development"
LICENSE = "MIT"

PV = "1.20.1"

RPM_NAME = "krb5-devel-1.20.1-6.2.aarch64.rpm"
RPM_HASH = "35da7fe5166cd628dfceb279e80a8ea43081570bb84f4c6d76f48b77db34f0d1370d44c48a060bf9c18ec9539eabc5903502e615f44b67633ee72e59aff84c85"

RPROVIDES:${PN} += "krb5-devel \
pkgconfig-gssrpc \
pkgconfig-kadm-client \
pkgconfig-kadm-server \
pkgconfig-kdb \
pkgconfig-krb5 \
pkgconfig-krb5-gssapi \
pkgconfig-mit-krb5 \
pkgconfig-mit-krb5-gssapi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
keyutils-devel \
krb5 \
pkgconfig-com-err \
pkgconfig-gssrpc \
pkgconfig-kdb \
pkgconfig-libverto \
pkgconfig-mit-krb5 \
pkgconfig-mit-krb5-gssapi \
pkgconfig-ss"

inherit rpm
