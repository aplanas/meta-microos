SUMMARY = "Freepascal Compiler documentation"
DESCRIPTION = "The fpc-doc package contains the documentation PDF files."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.2"

RPM_NAME = "fpc-doc-3.2.2-3.8.aarch64.rpm"
RPM_HASH = "1014f087823ff29c56135f094d51bea364769a1b19ec9d172ca3cea14c936847204689f1484e600bc893b0f3cd8c17dff230b23f8832b5c615d88757dcc7bc4d"

RPROVIDES:${PN} += "fpc-doc fpc-doc(aarch-64)"
RDEPENDS:${PN} += "binutils"

inherit rpm
