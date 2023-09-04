SUMMARY = "Documentation for texlive-yfonts-t1"
DESCRIPTION = "This package includes the documentation for texlive-yfonts-t1"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn36013"

RPM_NAME = "texlive-yfonts-t1-doc-2023.209.1.0svn36013-53.2.noarch.rpm"
RPM_HASH = "627be681314c9381c5a26a509220350f82d3a812eece0f6136fe6bab6e3d167a298dacb50c7af99863b5a6af61b8f9bf6282960cc664dd5e16b6f7d638f20232"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yfonts-t1-doc"

RDEPENDS:${PN} += ""

inherit rpm
