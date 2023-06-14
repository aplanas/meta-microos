SUMMARY = "Samba Ldb Ldap Modules"
DESCRIPTION = "samba-ldb-ldap contains the ldb ldap module required by samba-tool and \
samba-gpupdate."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1+git.298.4ccf830b2a4"

RPM_NAME = "samba-ldb-ldap-4.18.1+git.298.4ccf830b2a4-1.1.aarch64.rpm"
RPM_HASH = "78c6056717d7e5eb529a0b6e4c4ae61ca6b817692666018ceb70282a57eb530ffddb5e58d009d966184cdc0cb508805fd3ba294f0999e8e7586fd082e9d2090f"

RPROVIDES:${PN} += "samba-ldb-ldap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcli-ldap-common-samba4.so \
libcli-ldap-samba4.so \
libcmdline-samba4.so \
libgensec-samba4.so \
libldb.so.2 \
libldbsamba-samba4.so \
libreplace-samba4.so \
libsamba-credentials.so.1 \
libsamba-debug-samba4.so \
libsamba-hostconfig.so.0 \
libsamba-util.so.0 \
libsamdb-common-samba4.so \
libsamdb.so.0 \
libtalloc.so.2 \
libtevent.so.0"

inherit rpm
