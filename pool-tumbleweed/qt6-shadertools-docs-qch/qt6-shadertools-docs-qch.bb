SUMMARY = "Documentation for qt6-shadertools in QCH format"
DESCRIPTION = "This package contains documentation for qt6-shadertools in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-shadertools-docs-qch-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "f90cac25a0db4e4fd78997de7f5b93951fb24214e024606a57cd1c96c7ad5da934f5e594dfbfc67d29d64e17d6d267ce517cbd6829050981e9151c13cb034e44"

RPROVIDES:${PN} += "qt6-shadertools-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
