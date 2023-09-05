SUMMARY = "Python3 dependencies of samba-libs"
DESCRIPTION = "Dependencies of samba-libs that require python3."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.6+git.320.cfda27bacb"

RPM_NAME = "samba-libs-python3-4.18.6+git.320.cfda27bacb-1.1.aarch64.rpm"
RPM_HASH = "4df00c44502927bb85eb09e6e4f2d1a33ae450b60b3c11086f55f733bd71fa1d17c8c56ffc6a98cd21cd6bf9b829e426465b3b4e39683d4a407fb29c7a323b4d"

RPROVIDES:${PN} += "libsamba-net.cpython-311-aarch64-linux-gnu-samba4.so \
libsamba-python.cpython-311-aarch64-linux-gnu-samba4.so \
samba-libs-python3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libMESSAGING-samba4.so \
libc.so.6 \
libcli-cldap-samba4.so \
libcli-ldap-samba4.so \
libcliauth-samba4.so \
libdcerpc-binding.so.0 \
libdcerpc-samba-samba4.so \
libdcerpc.so.0 \
libevents-samba4.so \
libgenrand-samba4.so \
libgensec-samba4.so \
libgnutls.so.30 \
libldb.so.2 \
libldbsamba-samba4.so \
libndr-samba-samba4.so \
libndr-standard.so.0 \
libndr.so.3 \
libpyldb-util.cpython-311-aarch64-linux-gnu.so.2 \
libpytalloc-util.cpython-311-aarch64-linux-gnu.so.2 \
libpython3.11.so.1.0 \
libreplace-samba4.so \
libsamba-credentials.so.1 \
libsamba-debug-samba4.so \
libsamba-errors.so.1 \
libsamba-hostconfig.so.0 \
libsamba-security-samba4.so \
libsamba-sockets-samba4.so \
libsamba-util.so.0 \
libsamdb-common-samba4.so \
libsamdb.so.0 \
libserver-role-samba4.so \
libtalloc.so.2 \
libtevent-util.so.0 \
libtevent.so.0 \
python3"

inherit rpm
