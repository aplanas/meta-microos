SUMMARY = "Active Directory Group Policy library"
DESCRIPTION = "This subpackage contains the python3 library for policy management."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.3+git.303.c08b73d523c"

RPM_NAME = "libsamba-policy0-python3-4.18.3+git.303.c08b73d523c-1.2.aarch64.rpm"
RPM_HASH = "218329299ffd61a053a65605bfd08d47c59da5db8af7f0994c37b69b50e7e6c12c8d574e0f67e455b5b1715ac62ce3fabbe2518edf6487e7d3da8521ee5eed94"

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
