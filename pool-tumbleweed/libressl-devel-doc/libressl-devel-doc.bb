SUMMARY = "Documentation for the LibreSSL API"
DESCRIPTION = "LibreSSL is an open-source implementation of the Secure Sockets Layer \
(SSL) and Transport Layer Security (TLS) protocols. \
 \
This subpackage contains the manpages to the LibreSSL API."
LICENSE = "OpenSSL"

PV = "3.7.0"

RPM_NAME = "libressl-devel-doc-3.7.0-1.2.noarch.rpm"
RPM_HASH = "d3a08ba44b6bed10da610e627920d9896d031b1a642294ed6a8b3fa199bf5d723d66553ac6f37f5721e205414c53135125abda11edb9f9da214ce8da290a56d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libressl-devel-doc"
RDEPENDS:${PN} += ""

inherit rpm
