SUMMARY = "X.509 implementation from Heimdal Kerberos"
DESCRIPTION = "This package contains the X.509 support library from and for Heimdal Kerberos."
LICENSE = "BSD-3-Clause"

PV = "7.8.0"

RPM_NAME = "libhx509-5-7.8.0-3.2.aarch64.rpm"
RPM_HASH = "5425399982b3d9f56de95921aa3c35ace30159c3ec825b4e043f4451284e2b10f237a85942b9ef0857b59af3bb8531417e089447125ce7123b4695a20615078d"

RPROVIDES:${PN} += "libhx509-5 \
libhx509.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasn1.so.8 \
libc.so.6 \
libcom-err.so.2 \
libhcrypto.so.4 \
libheimbase.so.1 \
libroken.so.18 \
libwind.so.0"

inherit rpm
