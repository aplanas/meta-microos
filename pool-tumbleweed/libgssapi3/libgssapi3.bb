SUMMARY = "GSSAPI implementation from Heimdal Kerberos"
DESCRIPTION = "GSSAPI implementation from Heimdal."
LICENSE = "BSD-3-Clause"

PV = "7.8.0"

RPM_NAME = "libgssapi3-7.8.0-3.1.aarch64.rpm"
RPM_HASH = "88d181095da42e08cc39d7538fd5be58fde9a72b6829532fa9831d2df94cdfc402044aff2e13321431dcdd823e9b345db2bc23929d927daee0443808dcd9e119"

RPROVIDES:${PN} += "libgssapi.so.3 \
libgssapi3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasn1.so.8 \
libc.so.6 \
libcom-err.so.2 \
libhcrypto.so.4 \
libheimbase.so.1 \
libheimntlm.so.0 \
libkrb5.so.26 \
libroken.so.18"

inherit rpm
