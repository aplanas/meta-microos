SUMMARY = "Documentation for qt6-qt5compat in QCH format"
DESCRIPTION = "This package contains documentation for qt6-qt5compat in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-qt5compat-docs-qch-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "d79e9f52741fcd0b187f0315a77c42beef335407bf8218e9ebff4aea349da54aaf058923b5da5690636c4c1fdba7d84a9b4f146363f867dca0affdf6ca7fde20"

RPROVIDES:${PN} += "qt6-qt5compat-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
