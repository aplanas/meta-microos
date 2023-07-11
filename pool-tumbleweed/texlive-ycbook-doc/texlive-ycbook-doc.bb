SUMMARY = "Documentation for texlive-ycbook"
DESCRIPTION = "This package includes the documentation for texlive-ycbook"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn46201"

RPM_NAME = "texlive-ycbook-doc-2023.201.svn46201-52.2.noarch.rpm"
RPM_HASH = "195e35e4fa64673f365a200f854080c93819d0ce8ce9b18d9f334f56eaed099523a14b7e970855034dd21be2ad67fa44dc28951feeb60b860d912645190cd686"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ycbook-doc"

RDEPENDS:${PN} += ""

inherit rpm
