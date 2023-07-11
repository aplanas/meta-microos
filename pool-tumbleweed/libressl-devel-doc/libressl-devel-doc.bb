SUMMARY = "Documentation for the LibreSSL API"
DESCRIPTION = "LibreSSL is an open-source implementation of the Secure Sockets Layer \
(SSL) and Transport Layer Security (TLS) protocols. \
 \
This subpackage contains the manpages to the LibreSSL API."
LICENSE = "OpenSSL"

PV = "3.7.0"

RPM_NAME = "libressl-devel-doc-3.7.0-1.3.noarch.rpm"
RPM_HASH = "5a55a3f99ab58852de9123a8c772a0e2cce9d6ceca23b4a0d986af8af11a417f54893c3d950bc31e78869bdf70690aa9e7a5828731357f8b958346bd829db292"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libressl-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
