SUMMARY = "Active Directory Group Policy library"
DESCRIPTION = "This subpackage contains the python3 library for policy management."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.5+git.313.c8e274c7852"

RPM_NAME = "libsamba-policy0-python3-4.18.5+git.313.c8e274c7852-1.1.aarch64.rpm"
RPM_HASH = "2fc09a0494a8ee40575c3609dc5b1cae0ed9b00de766229e7eb008a56e77a8f6b169e67d9e9ca0075247b547ecac7751cf61d255a51ded5bfc81f98d8e8ae42e"

RPROVIDES:${PN} += "libsamba-policy.cpython-311-aarch64-linux-gnu.so.0 \
libsamba-policy0-python3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcli-ldap-common-samba4.so \
libcli-ldap-samba4.so \
libdcerpc.so.0 \
libgenrand-samba4.so \
libldb.so.2 \
libldbsamba-samba4.so \
libndr.so.3 \
libsamba-debug-samba4.so \
libsamba-hostconfig.so.0 \
libsamba-net.cpython-311-aarch64-linux-gnu-samba4.so \
libsamba-security-samba4.so \
libsamba-util.so.0 \
libsmbclient-raw-samba4.so \
libtalloc.so.2"

inherit rpm
