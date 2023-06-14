SUMMARY = "An RSA key and certificate management tool"
DESCRIPTION = "Graphical certification authority is an interface for managing RSA \
keys and certificates, and the creation and signing of PKCS#10 \
requests. It uses the OpenSSL library and a Berkeley DB for key and \
certificate storage. It supports importing and exporting keys and \
PEM/DER/PKCS8 certificates, signing and revoking of PEM/DER/PKCS12, \
and the selection of X509v3 extensions. A tree view of certificates \
is presented."
LICENSE = "BSD-3-Clause"

PV = "2.4.0"

RPM_NAME = "xca-2.4.0-2.3.aarch64.rpm"
RPM_HASH = "1014f210c25782c97d06593644bb00a97382e48ef8cf29b7bca3d032cadd61e9559c97300a6dd15de7e577c96d6d73bf913ba1d030c84b599a0e8cce2ecad8f5"

RPROVIDES:${PN} += "xca"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Help.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libcrypto.so.1.1 \
libgcc-s.so.1 \
libltdl.so.7 \
libstdc++.so.6"

inherit rpm
