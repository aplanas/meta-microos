SUMMARY = "Documentation for qt6-serialport in QCH format"
DESCRIPTION = "This package contains documentation for qt6-serialport in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-serialport-docs-qch-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "dea87ff14e1b0afee674871f5a1fb51cd77bae81ba5bfa9cb9b7acff0ab3dde31c181f85f1002d4f86d0614dfef51f899c0e689ec73061e8c4ed806c7210dfef"

RPROVIDES:${PN} += "qt6-serialport-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
