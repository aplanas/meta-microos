SUMMARY = "Documentation for qt6-tools in QCH format"
DESCRIPTION = "This package contains documentation for qt6-tools in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-tools-docs-qch-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "cb344b62f2bce8cd6ac68f0645936f4af058c2b5fba845f2efea7b1aed2eea58a19eeff20d240b054d2e84120ad1c03bc51fe605ca173479f0b83c6fc2bf01b6"

RPROVIDES:${PN} += "qt6-tools-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
