SUMMARY = "Documentation and examples for the Qore sqlute3 module"
DESCRIPTION = "This package contains the HTML documentation and example programs for the Qore \
xml module."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.2"

RPM_NAME = "qore-sqlite3-module-doc-1.0.2-2.2.noarch.rpm"
RPM_HASH = "03694029831a0fa8bd0bc2c4e88c7798c5a99b14bc4e2a12b8c9684e2f55d2a4d19a5cb04f540f7571b6e572c90978567ea8e4eb45e1c7e5ef197649fa587106"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qore-sqlite3-module-doc"

RDEPENDS:${PN} += ""

inherit rpm
