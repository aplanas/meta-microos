SUMMARY = "Documentation for qt6-webview in QCH format"
DESCRIPTION = "This package contains documentation for qt6-webview in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-webview-docs-qch-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "d35aa6871fd5f36aac99709c9024dbd229de0fcd4a564bc6696c8f90ff573a79e9517c49a53927b2664e3010a1b805b6c9888794668aa9061615178e9b1c2935"

RPROVIDES:${PN} += "qt6-webview-docs-qch"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
