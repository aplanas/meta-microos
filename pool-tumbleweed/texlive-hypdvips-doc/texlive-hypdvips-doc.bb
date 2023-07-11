SUMMARY = "Documentation for texlive-hypdvips"
DESCRIPTION = "This package includes the documentation for texlive-hypdvips"
LICENSE = "LPPL-1.0"

PV = "2023.208.3.03svn53197"

RPM_NAME = "texlive-hypdvips-doc-2023.208.3.03svn53197-53.1.noarch.rpm"
RPM_HASH = "809a62d8feeaaf999502c00b52c4f21b1a18515f9bd1e74688278d1c5cec8592138c7c7908524bdaad8c4763bd5858437cebe2e14a8e0a5acaefd6ecd7cf6168"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hypdvips-doc"

RDEPENDS:${PN} += ""

inherit rpm
