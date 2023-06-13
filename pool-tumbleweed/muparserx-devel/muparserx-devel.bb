SUMMARY = "Development files for muParserX"
DESCRIPTION = "The muparserx development files. A C++ Library for Parsing Expressions with \
Strings, Complex Numbers, Vectors, Matrices and more."
LICENSE = "BSD-2-Clause"

PV = "4.0.12"

RPM_NAME = "muparserx-devel-4.0.12-1.3.aarch64.rpm"
RPM_HASH = "9470b60ea8e890fd1495d16e18b360a05557892ec29de46c2e84b2728b3886a70f431d0d7254b30cd8b515ce08839a9bdd76838e52ff21cd0dacb3e514cb84c8"

RPROVIDES:${PN} += "cmake(muparserx) \
muparserx-devel \
muparserx-devel(aarch-64) \
pkgconfig(muparserx)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmuparserx4_0_12"

inherit rpm
