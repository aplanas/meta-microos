SUMMARY = "Active Directory Group Policy library"
DESCRIPTION = "This subpackage contains the python3 library for policy management."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.6+git.320.cfda27bacb"

RPM_NAME = "libsamba-policy0-python3-4.18.6+git.320.cfda27bacb-1.1.aarch64.rpm"
RPM_HASH = "7627f711f76418f4c2ef7fe70175cb2d776f27215f350ad60dcf067e445f55e8fb26b9285146afc893ae45190998ffe5fc6f5d1c6b069674c7ff7c22c790397f"

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
