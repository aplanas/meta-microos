SUMMARY = "Documentation for texlive-dccpaper"
DESCRIPTION = "This package includes the documentation for texlive-dccpaper"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3svn61763"

RPM_NAME = "texlive-dccpaper-doc-2023.201.2.3svn61763-52.1.noarch.rpm"
RPM_HASH = "0b1639d16416973748e57d52938c1123da98178fa61b0ad2f0121e4958beefbb3a16198da3aa80cac07171883c9c2857cf80d8b573ef74c12c0a5c0a0d9dd786"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dccpaper-doc"
RDEPENDS:${PN} += ""

inherit rpm
