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

RPM_NAME = "xca-2.4.0-2.4.aarch64.rpm"
RPM_HASH = "b14bd5e1e0fe0416904fb3f3af8aa5a36e9292e6a3dd0a77d6e6474a373258060caa82a573db863369bd528c7adf59e03cd1b5154b1a2c5d3573dbce8f4eb1ee"

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
