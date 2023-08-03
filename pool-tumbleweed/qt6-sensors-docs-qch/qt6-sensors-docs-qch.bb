SUMMARY = "Documentation for qt6-sensors in QCH format"
DESCRIPTION = "This package contains documentation for qt6-sensors in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-sensors-docs-qch-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "0f1a92f7eea7f66012e39962be6eebe9a2fc6f91ed8ab9b5ec74c2e75794e7acb5d75bbadef4d52f919ed4e67ea3166be192e83efee6d5568d090fc22fa8cb6a"

RPROVIDES:${PN} += "qt6-sensors-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
