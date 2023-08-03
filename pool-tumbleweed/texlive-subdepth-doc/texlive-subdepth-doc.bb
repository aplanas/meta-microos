SUMMARY = "Documentation for texlive-subdepth"
DESCRIPTION = "This package includes the documentation for texlive-subdepth"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn15878"

RPM_NAME = "texlive-subdepth-doc-2023.209.0.0.1svn15878-58.1.noarch.rpm"
RPM_HASH = "8963c665c81aa4f93ff7767ba1cff7e62a3b5e4709da63d28b16f6430d17f677b681bf5bc576170e24bb45e6a37c233dbcbc03ab443d99ad84a97a20fe67ed3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-subdepth-doc"

RDEPENDS:${PN} += ""

inherit rpm
