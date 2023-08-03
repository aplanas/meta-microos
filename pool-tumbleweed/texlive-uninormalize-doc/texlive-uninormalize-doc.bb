SUMMARY = "Documentation for texlive-uninormalize"
DESCRIPTION = "This package includes the documentation for texlive-uninormalize"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn57257"

RPM_NAME = "texlive-uninormalize-doc-2023.209.0.0.1svn57257-54.1.noarch.rpm"
RPM_HASH = "25a67cab871de3473b90b9b061e2b3a97bfd8f85446996d3a0e5d4f89813bff4704f7755f0ce672faaf17370d508fca7d5a9887c4d3be44ee9b570fa704852d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uninormalize-doc"

RDEPENDS:${PN} += ""

inherit rpm
