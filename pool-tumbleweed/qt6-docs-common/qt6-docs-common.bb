SUMMARY = "Common files for building documentation"
DESCRIPTION = "This package contains common files used for building Qt documentation."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-docs-common-6.5.1-1.1.noarch.rpm"
RPM_HASH = "308e3779b816318e2cb5fa8e06feaa71aae4e32830d47c0bd912049789c3a3570e9ecebc581229d305b12641a6393207da411ad5fb15569109e15337f08066fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qt6-docs-common"
RDEPENDS:${PN} += ""

inherit rpm
