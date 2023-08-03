SUMMARY = "Documentation for texlive-grant"
DESCRIPTION = "This package includes the documentation for texlive-grant"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0.5svn56852"

RPM_NAME = "texlive-grant-doc-2023.209.0.0.0.5svn56852-54.1.noarch.rpm"
RPM_HASH = "052774dbe3ce7c0944f9be2b2564b92a91d3f2427de1e40efd5446aca2ffcbd3319fa25bbe70f3a44990f48b3da397e980fbf422b56b7302f2eca12168d141fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grant-doc"

RDEPENDS:${PN} += ""

inherit rpm
