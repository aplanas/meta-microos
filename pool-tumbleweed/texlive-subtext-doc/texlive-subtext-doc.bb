SUMMARY = "Documentation for texlive-subtext"
DESCRIPTION = "This package includes the documentation for texlive-subtext"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1svn51273"

RPM_NAME = "texlive-subtext-doc-2023.201.1.1svn51273-57.1.noarch.rpm"
RPM_HASH = "9eb788acf844e0ee406292f93f4319e89c8638b625f48f1c019e0fa8d64efe3375f6507948adb86f899b0bf296dda464d37ca90b1e3fd15f418ba120fc5145f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-subtext-doc"

RDEPENDS:${PN} += ""

inherit rpm
