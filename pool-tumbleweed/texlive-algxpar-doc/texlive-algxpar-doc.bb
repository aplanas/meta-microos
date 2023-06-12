SUMMARY = "Documentation for texlive-algxpar"
DESCRIPTION = "This package includes the documentation for texlive-algxpar"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.91svn56006"

RPM_NAME = "texlive-algxpar-doc-2023.201.0.0.91svn56006-54.1.noarch.rpm"
RPM_HASH = "47016e45ca9566efe2c14e000d42d2c945e4859f02a181a23324785eb58697a148c9644727527a9acce38f0bb4fb41806b5e0b1e572f1157fbe2c50c2b104921"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-algxpar-doc"
RDEPENDS:${PN} += ""

inherit rpm
