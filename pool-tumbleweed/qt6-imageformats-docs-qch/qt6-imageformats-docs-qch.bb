SUMMARY = "Documentation for qt6-imageformats in QCH format"
DESCRIPTION = "This package contains documentation for qt6-imageformats in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-imageformats-docs-qch-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "b8bd366d8f1fc733f25f617709525e3a8c73ce8ae846377019d07b0bea1f144ffc2be24e8ceec6c2a69907b21469f4e24103feef8582874b31394bc6b69dbd22"

RPROVIDES:${PN} += "qt6-imageformats-docs-qch \
qt6-imageformats-docs-qch(aarch-64)"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
