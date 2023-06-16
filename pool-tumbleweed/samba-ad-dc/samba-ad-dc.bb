SUMMARY = "Samba Active Directory-compatible Domain Controller"
DESCRIPTION = "This package contains the Active Directory-compatible Domain Controller"
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1+git.298.4ccf830b2a4"

RPM_NAME = "samba-ad-dc-4.18.1+git.298.4ccf830b2a4-1.1.aarch64.rpm"
RPM_HASH = "cd762e61ef8c3cf663870218699de2a8d6ed9f5033d5aac10bcff892642d9441c460cfd16a8b1612d3b9d21a03a26e0b189e9aa8467d81fbd3ddbbe8139bb98d"

RPROVIDES:${PN} += "samba-ad-dc \
samba-kdc"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libMESSAGING-SEND-samba4.so \
libMESSAGING-samba4.so \
libc.so.6 \
libcliauth-samba4.so \
libcluster-samba4.so \
libcmdline-samba4.so \
libevents-samba4.so \
libgenrand-samba4.so \
libgensec-samba4.so \
libldb.so.2 \
libndr-samba4.so \
libpopt.so.0 \
libprocess-model-samba4.so \
libreplace-samba4.so \
libsamba-credentials.so.1 \
libsamba-debug-samba4.so \
libsamba-hostconfig.so.0 \
libsamba-util.so.0 \
libsamdb-common-samba4.so \
libsamdb.so.0 \
libservice-samba4.so \
libsocket-blocking-samba4.so \
libtalloc.so.2 \
libtevent.so.0 \
samba \
samba-dsdb-modules \
samba-python3 \
samba-tool"

inherit rpm
