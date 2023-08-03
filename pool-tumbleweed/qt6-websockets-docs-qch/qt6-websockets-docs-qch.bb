SUMMARY = "Documentation for qt6-websockets in QCH format"
DESCRIPTION = "This package contains documentation for qt6-websockets in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-websockets-docs-qch-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "776acce478f35f1aee6c98d903e5eaf3a8629a6a6f5508c5ffd7f2c954e677b147b5803748bae2d176267021f4ca012fc074eae86e42917e816a794906aa6784"

RPROVIDES:${PN} += "qt6-websockets-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
