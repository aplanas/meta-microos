SUMMARY = "Documentation for texlive-pst-arrow"
DESCRIPTION = "This package includes the documentation for texlive-pst-arrow"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.05svn61069"

RPM_NAME = "texlive-pst-arrow-doc-2023.201.0.0.05svn61069-52.1.noarch.rpm"
RPM_HASH = "877cb796e7c2e437f71c5208f0c8ac320edbf050d0e66f1ef3b6a108852f9dd45ddc47d4b8df4dc326d826923a075257e6cadb1f7135945d729398e9e79aed6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-arrow-doc"
RDEPENDS:${PN} += ""

inherit rpm
