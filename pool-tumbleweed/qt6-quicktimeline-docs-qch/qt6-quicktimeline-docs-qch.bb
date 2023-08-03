SUMMARY = "Documentation for qt6-quicktimeline in QCH format"
DESCRIPTION = "This package contains documentation for qt6-quicktimeline in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-quicktimeline-docs-qch-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "26b58dbf0badf04637701ebb0973ff7fcd319f84fde5893c26f965812ddea285e95b2a19b5e470c5c737c7eb5cbb65f74c26145c085433dc0f5d67626123d636"

RPROVIDES:${PN} += "qt6-quicktimeline-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
