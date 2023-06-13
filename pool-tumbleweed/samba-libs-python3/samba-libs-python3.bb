SUMMARY = "Python3 dependencies of samba-libs"
DESCRIPTION = "Dependencies of samba-libs that require python3."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1+git.298.4ccf830b2a4"

RPM_NAME = "samba-libs-python3-4.18.1+git.298.4ccf830b2a4-1.1.aarch64.rpm"
RPM_HASH = "dfcb3c285311aed5fd7ced07b3f730f8a65107b2464a22ce1d82d4ee87bd57dbe96553799eaa8f0cb9f8f018691638db22618f22ba7f5d039078d75d7ff8ad22"

RPROVIDES:${PN} += "libsamba-net.cpython-310-aarch64-linux-gnu-samba4.so()(64bit) \
libsamba-python.cpython-310-aarch64-linux-gnu-samba4.so()(64bit) \
samba-libs-python3 \
samba-libs-python3(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libMESSAGING-samba4.so()(64bit) \
libc.so.6()(64bit) \
libcli-cldap-samba4.so()(64bit) \
libcli-ldap-samba4.so()(64bit) \
libcliauth-samba4.so()(64bit) \
libdcerpc-binding.so.0()(64bit) \
libdcerpc-samba-samba4.so()(64bit) \
libdcerpc.so.0()(64bit) \
libevents-samba4.so()(64bit) \
libgenrand-samba4.so()(64bit) \
libgensec-samba4.so()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgnutls.so.30(GNUTLS_3_6_13)(64bit) \
libgnutls.so.30(GNUTLS_3_6_3)(64bit) \
libldb.so.2()(64bit) \
libldbsamba-samba4.so()(64bit) \
libndr-samba-samba4.so()(64bit) \
libndr-standard.so.0()(64bit) \
libndr.so.3()(64bit) \
libpyldb-util.cpython-310-aarch64-linux-gnu.so.2()(64bit) \
libpytalloc-util.cpython-310-aarch64-linux-gnu.so.2()(64bit) \
libpython3.10.so.1.0()(64bit) \
libreplace-samba4.so()(64bit) \
libsamba-credentials.so.1()(64bit) \
libsamba-debug-samba4.so()(64bit) \
libsamba-errors.so.1()(64bit) \
libsamba-hostconfig.so.0()(64bit) \
libsamba-security-samba4.so()(64bit) \
libsamba-sockets-samba4.so()(64bit) \
libsamba-util.so.0()(64bit) \
libsamdb-common-samba4.so()(64bit) \
libsamdb.so.0()(64bit) \
libserver-role-samba4.so()(64bit) \
libtalloc.so.2()(64bit) \
libtevent-util.so.0()(64bit) \
libtevent.so.0()(64bit) \
python3"

inherit rpm
