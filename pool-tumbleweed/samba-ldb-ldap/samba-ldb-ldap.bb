SUMMARY = "Samba Ldb Ldap Modules"
DESCRIPTION = "samba-ldb-ldap contains the ldb ldap module required by samba-tool and \
samba-gpupdate."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.3+git.303.c08b73d523c"

RPM_NAME = "samba-ldb-ldap-4.18.3+git.303.c08b73d523c-1.2.aarch64.rpm"
RPM_HASH = "0d4fdd3a1bbf915c5aa6f3fdbaa0eafbb3831667525a44c155d57d672d25d57603357bc489d0e457984f7717dd72bed946fd8d7bc2855c21b7bb691a07f2521a"

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
