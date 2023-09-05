SUMMARY = "Samba Active Directory-compatible Domain Controller"
DESCRIPTION = "This package contains the Active Directory-compatible Domain Controller"
LICENSE = "GPL-3.0-or-later"

PV = "4.18.6+git.320.cfda27bacb"

RPM_NAME = "samba-ad-dc-4.18.6+git.320.cfda27bacb-1.1.aarch64.rpm"
RPM_HASH = "51f37f51b4310137971cd56475439d4becbd514adecdd06f58eff5ac84cbb233d550672e6ca55887d14e296c479e9182ea2cde5a4fae09811428db63063d0919"

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
