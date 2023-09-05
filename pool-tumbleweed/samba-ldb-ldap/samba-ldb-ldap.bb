SUMMARY = "Samba Ldb Ldap Modules"
DESCRIPTION = "samba-ldb-ldap contains the ldb ldap module required by samba-tool and \
samba-gpupdate."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.6+git.320.cfda27bacb"

RPM_NAME = "samba-ldb-ldap-4.18.6+git.320.cfda27bacb-1.1.aarch64.rpm"
RPM_HASH = "c3d510f816cd8148de852a9cb3f1564291f423f3dc547ad6f280b8e1fec2777e254c5fcef33ab80c44ca22f30a2403225f0e7954abe3703cefd891d711c5d109"

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
