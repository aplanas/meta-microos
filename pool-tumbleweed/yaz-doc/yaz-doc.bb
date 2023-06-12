SUMMARY = "Documentation for yaz (Z39.50 Library)"
DESCRIPTION = "YAZ is a C library for developing client and server applications \
using the ANSI/NISO Z39.50 protocol for Information Retrieval. \
 \
This package contains the documentation."
LICENSE = "BSD-3-Clause"

PV = "5.34.0"

RPM_NAME = "yaz-doc-5.34.0-1.4.noarch.rpm"
RPM_HASH = "7bb7f96b85f5dc4d8befda10e59529bc746ca5208e75c63f2bf194a17f9ed33c5c29f8221727b6055b2617de86fa602ffa45413862b2d7744b7833b840e51142"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yaz-doc"
RDEPENDS:${PN} += ""

inherit rpm
