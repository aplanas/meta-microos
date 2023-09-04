SUMMARY = "Documentation for texlive-pst2pdf"
DESCRIPTION = "This package includes the documentation for texlive-pst2pdf"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.20svn56172"

RPM_NAME = "texlive-pst2pdf-doc-2023.209.0.0.20svn56172-54.2.noarch.rpm"
RPM_HASH = "4ef7118b40735f060eef289717de83efff846d8604717434127f8b06b3038763be00409d5e6a00f2e2f5df4939798100ae4aa6f334c0df4bb20498865e9d25a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst2pdf-doc"

RDEPENDS:${PN} += ""

inherit rpm
