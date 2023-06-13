SUMMARY = "Development files for qbs"
DESCRIPTION = "This package is required to develop applications using qbs as a library"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & (LGPL-2.1-only | LGPL-3.0-only-WITH-Qt-LGPL-exception-1.1) & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "1.24.0"

RPM_NAME = "qbs-devel-1.24.0-1.3.aarch64.rpm"
RPM_HASH = "047c48fc05f507f3233d0fe79365675736bc435d01894a994fd73f166131d1b7e51230c6cae8060d74908e80fdd5f4cea3c784c5ad64f6a445369cb97dc6759d"

RPROVIDES:${PN} += "qbs-devel \
qbs-devel(aarch-64)"

RDEPENDS:${PN} += "qbs"

inherit rpm
