SUMMARY = "Winbind Daemon libraries"
DESCRIPTION = "This package contains the libraries required by the Winbind daemon."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.5+git.313.c8e274c7852"

RPM_NAME = "samba-winbind-libs-4.18.5+git.313.c8e274c7852-1.1.aarch64.rpm"
RPM_HASH = "5b05b848667f57dda97b6c0384832fe44d2fb41630b799676bb0040a20cd07aea148015b8fc04294edc3ce7039abda2563e2c9d03a8223579e59228f3a0cebb9"

RPROVIDES:${PN} += "libidmap-samba4.so \
libnss-info-samba4.so \
libnss-winbind.so.2 \
samba-winbind-libs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libads-samba4.so \
libasn1util-samba4.so \
libc.so.6 \
libcli-ldap-common-samba4.so \
libcom-err.so.2 \
libdbwrap-samba4.so \
libgensec-samba4.so \
libgse-samba4.so \
libkrb5.so.3 \
libldap.so.2 \
libndr.so.3 \
libpam.so.0 \
libreplace-samba4.so \
libsamba-debug-samba4.so \
libsamba-errors.so.1 \
libsamba-hostconfig.so.0 \
libsamba-modules-samba4.so \
libsamba-passdb.so.0 \
libsamba-security-samba4.so \
libsamba-sockets-samba4.so \
libsamba-util.so.0 \
libsamba3-util-samba4.so \
libsecrets3-samba4.so \
libsmbconf.so.0 \
libsmbldap.so.2 \
libsmbldaphelper-samba4.so \
libtalloc.so.2 \
libtdb.so.1 \
libtevent-util.so.0 \
libtevent.so.0 \
libutil-tdb-samba4.so \
samba-client-libs"

inherit rpm
