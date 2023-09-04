SUMMARY = "Documentation for texlive-epstopdf-pkg"
DESCRIPTION = "This package includes the documentation for texlive-epstopdf-pkg"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.11svn53546"

RPM_NAME = "texlive-epstopdf-pkg-doc-2023.209.2.11svn53546-54.2.noarch.rpm"
RPM_HASH = "7cada331e253b80b93ac5c2cb0f871a9bdffcda55324b01d4009f6dabc8298a061bc71290b2f785d3d3cd859314e736afbdc8c3ff30330c343905b87e72b5b9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epstopdf-pkg-doc"

RDEPENDS:${PN} += ""

inherit rpm
