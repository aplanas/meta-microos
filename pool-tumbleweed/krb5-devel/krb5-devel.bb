SUMMARY = "Development files for MIT Kerberos5"
DESCRIPTION = "Kerberos V5 is a trusted-third-party network authentication system, \
which can improve network security by eliminating the insecure \
practice of cleartext passwords. This package includes Libraries and \
Include Files for Development"
LICENSE = "MIT"

PV = "1.21.1"

RPM_NAME = "krb5-devel-1.21.1-1.1.aarch64.rpm"
RPM_HASH = "6ecf5d2b788b6c61930509d2440e5b00a405227ada7b189cf7ef7127138768d888c43142bd877227b193b09791a0310e1b09bc1f2a7394c397a3333b07b551c0"

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
