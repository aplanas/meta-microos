SUMMARY = "Documentation for qt6-shadertools in QCH format"
DESCRIPTION = "This package contains documentation for qt6-shadertools in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-shadertools-docs-qch-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "01eb357bc9efb6de7f57f179fb55e859ce684111e87241112a68ad684ff6a52064b1d4d96749e93cf0513b1239bd312f0cab6856eff081799adc346c722fb1a5"

RPROVIDES:${PN} += "qt6-shadertools-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
