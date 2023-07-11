SUMMARY = "Samba Active Directory-compatible Domain Controller"
DESCRIPTION = "This package contains the Active Directory-compatible Domain Controller"
LICENSE = "GPL-3.0-or-later"

PV = "4.18.3+git.303.c08b73d523c"

RPM_NAME = "samba-ad-dc-4.18.3+git.303.c08b73d523c-1.2.aarch64.rpm"
RPM_HASH = "689693831da99634b59f127412c26244d48ec48c15312e04b570b0ab55e1b53bb85ab8bd2c3bf4a0cef2da5c775d248454447408910486ed96ea4397279ed6b7"

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
