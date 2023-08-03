SUMMARY = "Python3 dependencies of samba-libs"
DESCRIPTION = "Dependencies of samba-libs that require python3."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.5+git.313.c8e274c7852"

RPM_NAME = "samba-libs-python3-4.18.5+git.313.c8e274c7852-1.1.aarch64.rpm"
RPM_HASH = "cf5f4c01a1610c7343f7a7efd81bc19b3edaa8e46acd32bb45962bcc0c72071acfc685cd471f588e87f893852cc8840c552a4d1e6087ec079b199354e51efd78"

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
