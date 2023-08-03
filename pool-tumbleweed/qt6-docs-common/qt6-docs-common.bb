SUMMARY = "Common files for building documentation"
DESCRIPTION = "This package contains common files used for building Qt documentation."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-docs-common-6.5.2-1.1.noarch.rpm"
RPM_HASH = "a014606993cbd4efec3c6ad75195999bb2b205b7e24397019c78de30456696ba0a2b3eb33c61ef112e01f689827edc25f7c3250d9ca61eff54163a0d25e569be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qt6-docs-common"

RDEPENDS:${PN} += ""

inherit rpm
