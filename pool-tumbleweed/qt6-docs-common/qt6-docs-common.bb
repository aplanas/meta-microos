SUMMARY = "Common files for building documentation"
DESCRIPTION = "This package contains common files used for building Qt documentation."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-docs-common-6.5.1-4.1.noarch.rpm"
RPM_HASH = "488d941039e619a3ae25e50af75a987227020ee70a730192689e4e911dafd05759036f1c82a8c018e26a997c3682e3977d87fa0dd3450d2cfecc5acc2822c393"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qt6-docs-common"

RDEPENDS:${PN} += ""

inherit rpm
