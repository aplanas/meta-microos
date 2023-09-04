SUMMARY = "Library providing support for 'XML Signature' and 'XML Encryption' standards"
DESCRIPTION = "XML Security Library is a C library based on LibXML2  and OpenSSL. \
The library was created with a goal to support major XML security \
standards 'XML Digital Signature' and 'XML Encryption'."
LICENSE = "MIT"

PV = "1.2.37"

RPM_NAME = "xmlsec1-1.2.37-3.1.aarch64.rpm"
RPM_HASH = "e4da8c674722ebb854bd35f41f254b44f5232d85907c18d9666ce39259bad85f1fa0657a39c75e40ceddc8e22b1e1d38f8f0188dfcefbf5f64f0af90ccc05722"

RPROVIDES:${PN} += "xmlsec1"

RDEPENDS:${PN} += "libc.so.6 \
libxml2.so.2 \
libxmlsec1.so.1 \
libxslt.so.1"

inherit rpm
