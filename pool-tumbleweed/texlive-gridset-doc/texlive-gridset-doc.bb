SUMMARY = "Documentation for texlive-gridset"
DESCRIPTION = "This package includes the documentation for texlive-gridset"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn53762"

RPM_NAME = "texlive-gridset-doc-2023.201.0.0.3svn53762-53.1.noarch.rpm"
RPM_HASH = "3118936a7be0d06aaa1f38330da0616167e7a17fbb66eeacc372a7bc39fcb8c1e1baa0c9bae63dbe5303c4edb19e7b3a4ac015bb0335ea40d49037b43442e98b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gridset-doc"

RDEPENDS:${PN} += ""

inherit rpm
