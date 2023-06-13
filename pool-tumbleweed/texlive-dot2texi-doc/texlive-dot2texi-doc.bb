SUMMARY = "Documentation for texlive-dot2texi"
DESCRIPTION = "This package includes the documentation for texlive-dot2texi"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.3.0svn26237"

RPM_NAME = "texlive-dot2texi-doc-2023.201.3.0svn26237-52.1.noarch.rpm"
RPM_HASH = "0f4c6515d9f6ca60dbde64503ef4e7d3529437fad5d56649277b281ff950db9a25d3d48b0af619cf670a6966ccaf6fb492105000d90e0c7af34cb87ea5b5c20c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dot2texi-doc"

RDEPENDS:${PN} += ""

inherit rpm
