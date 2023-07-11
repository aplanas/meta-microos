SUMMARY = "Common files for building documentation"
DESCRIPTION = "This package contains common files used for building Qt documentation."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-docs-common-6.5.1-3.1.noarch.rpm"
RPM_HASH = "a6ea10878fa5901b25312022211397205abcdd26877c35b43ee383bb3d7db0208c4b09439f8a618a731b98133e67087b5454614d4eb8d0eb7cc2b5e668315a55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qt6-docs-common"

RDEPENDS:${PN} += ""

inherit rpm
