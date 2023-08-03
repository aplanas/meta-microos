SUMMARY = "Documentation for qt6-quickeffectmaker in QCH format"
DESCRIPTION = "This package contains documentation for qt6-quickeffectmaker in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-quickeffectmaker-docs-qch-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "89bd266c1d9e5c041a662e3ccd034009e0548422dcb67cee1c20dcf14166bd17ec0747e7820ba54e084f27be96a672f35ce1809046ae6a3c68486aa58caef3a5"

RPROVIDES:${PN} += "qt6-quickeffectmaker-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
