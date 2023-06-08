SUMMARY = "Documentation how to Use Atril"
DESCRIPTION = "This package contains the documentation for atril"
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.26.0"

RPM_NAME = "atril-doc-1.26.0-1.11.noarch.rpm"
RPM_HASH = "b04483cf498c5f7764e22c069b14ede5e1103a21bb5961d1c6a39087dd9721721fcc84b21be81f42de29c7bdf614b5b70a71f0bd2d5eee0d5b212a8b8ac76227"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "atril-doc"
RDEPENDS:${PN} += "atril"

inherit rpm
