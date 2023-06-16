SUMMARY = "Documentation for qt6-httpserver in QCH format"
DESCRIPTION = "This package contains documentation for qt6-httpserver in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-httpserver-docs-qch-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "a505b8efd961cf8663b0c9b44ac4ee5c7f81d2d259dc159a4c37e0d54b70d6b71fb3a4e11ce3d97752b72a21c43281a76fa3da30939bb5b5e76c4795f4350969"

RPROVIDES:${PN} += "qt6-httpserver-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
