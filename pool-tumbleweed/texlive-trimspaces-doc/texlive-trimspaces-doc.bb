SUMMARY = "Documentation for texlive-trimspaces"
DESCRIPTION = "This package includes the documentation for texlive-trimspaces"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-trimspaces-doc-2023.209.1.1svn15878-53.1.noarch.rpm"
RPM_HASH = "27df0f177e9e7edca9f04df5125fbcd65458d1b4419712853cb681448985aa66f6625b04df99f8c1f036790378e5217d6ba5609aa79b2b4bd7c5bf5550c771cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-trimspaces-doc"

RDEPENDS:${PN} += ""

inherit rpm
