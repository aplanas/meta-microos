SUMMARY = "System Security Services Daemon"
DESCRIPTION = "Provides a set of daemons to manage access to remote directories and \
authentication mechanisms. It provides an NSS and PAM interface toward \
the system and a pluggable backend system to connect to multiple different \
account sources. It is also the basis to provide client auditing and policy \
services for projects like FreeIPA."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.9.0"

RPM_NAME = "sssd-2.9.0-1.1.aarch64.rpm"
RPM_HASH = "121e0cad027e137f63a0c3dbd70ad027f325a9df91743b9c61867c6f02c46265c6b042a0986de1d078e9a75c3048bf752c7ad423b77ee9273b8f649eee7480e5"

RPROVIDES:${PN} += "config-sssd \
libifp-iface-sync.so \
libifp-iface.so \
libnss-sss.so.2 \
libsss-autofs.so \
libsss-cert.so \
libsss-child.so \
libsss-crypt.so \
libsss-debug.so \
libsss-iface-sync.so \
libsss-iface.so \
libsss-sbus-sync.so \
libsss-sbus.so \
libsss-semanage.so \
libsss-simple.so \
libsss-sudo \
libsss-sudo.so \
libsss-util.so \
libsubid-sss.so \
sssd \
sssd-client"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcares.so.2 \
libcom-err.so.2 \
libcrypto.so.3 \
libdbus-1.so.3 \
libdhash.so.1 \
libgssapi-krb5.so.2 \
libini-config.so.5 \
libjansson.so.4 \
libkeyutils.so.1 \
libkrad.so.0 \
libkrb5.so.3 \
libldb.so.2 \
libnl-3.so.200 \
libnl-route-3.so.200 \
libp11-kit.so.0 \
libpam.so.0 \
libpcre2-8.so.0 \
libpopt.so.0 \
libref-array.so.1 \
libselinux.so.1 \
libsemanage.so.2 \
libssl.so.3 \
libsss-certmap.so.0 \
libsss-idmap.so.0 \
libsss-nss-idmap.so.0 \
libsystemd.so.0 \
libtalloc.so.2 \
libtdb.so.1 \
libtevent.so.0 \
libunistring.so.5 \
pam-config \
sssd-ldap \
update-alternatives"

inherit rpm
