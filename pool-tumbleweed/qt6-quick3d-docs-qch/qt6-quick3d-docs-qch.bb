SUMMARY = "Documentation for qt6-quick3d in QCH format"
DESCRIPTION = "This package contains documentation for qt6-quick3d in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-quick3d-docs-qch-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "e8bd125656068f25b5f79d543802de7537e80bcf776f90c4b7977345a914c803edd6469cbc87432320b7e41087c40927e26f85b1d55e839fe0254037434c74e9"

RPROVIDES:${PN} += "qt6-quick3d-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
