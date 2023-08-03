SUMMARY = "Samba Ldb Ldap Modules"
DESCRIPTION = "samba-ldb-ldap contains the ldb ldap module required by samba-tool and \
samba-gpupdate."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.5+git.313.c8e274c7852"

RPM_NAME = "samba-ldb-ldap-4.18.5+git.313.c8e274c7852-1.1.aarch64.rpm"
RPM_HASH = "09f2897e66bd074d49894a9c305d503e9dd223d3690fe56695c884d0b004d74ecf3367cacab8bd4223ec457cc3fe254c275db3e5064c939a07abdd79af08b719"

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
