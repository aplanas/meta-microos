SUMMARY = "Documentation for texlive-bclogo"
DESCRIPTION = "This package includes the documentation for texlive-bclogo"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1svn39364"

RPM_NAME = "texlive-bclogo-doc-2023.209.3.1svn39364-54.1.noarch.rpm"
RPM_HASH = "6d7bbfda716f183c2fab42a7f0bd285da9633948f47e9f6033377335c4abf65280a670af04de270d827eb34edb6890599f2a9d24e3b52cb7a4dae19183756956"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-bclogo-doc-fr;en \
texlive-bclogo-doc"

RDEPENDS:${PN} += ""

inherit rpm
