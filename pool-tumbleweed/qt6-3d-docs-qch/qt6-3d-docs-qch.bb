SUMMARY = "Documentation for qt6-3d in QCH format"
DESCRIPTION = "This package contains documentation for qt6-3d in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-3d-docs-qch-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "f54bd0a9a490bf0f7a51195b9a976c0136df1b5381eff76a218d8351699efaad8d4833e3e8f9078e2d96c68902e6ed616c6be4d4975dc621d2ebe74959aab082"

RPROVIDES:${PN} += "qt6-3d-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
