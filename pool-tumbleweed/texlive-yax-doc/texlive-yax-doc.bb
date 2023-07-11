SUMMARY = "Documentation for texlive-yax"
DESCRIPTION = "This package includes the documentation for texlive-yax"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.03svn54080"

RPM_NAME = "texlive-yax-doc-2023.201.1.03svn54080-52.2.noarch.rpm"
RPM_HASH = "36d60960935f92d3b4f3e7d02d40d53aec79c6254c86b3d91883e7a63798b0a954db62702b698d12e6ad1ea3e0e458e6af6222146106e6ef50012db7fafd4de4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yax-doc"

RDEPENDS:${PN} += ""

inherit rpm
