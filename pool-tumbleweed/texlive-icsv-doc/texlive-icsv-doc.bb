SUMMARY = "Documentation for texlive-icsv"
DESCRIPTION = "This package includes the documentation for texlive-icsv"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn15878"

RPM_NAME = "texlive-icsv-doc-2023.201.0.0.2svn15878-52.1.noarch.rpm"
RPM_HASH = "f3f8217676fb5538f75646b1d9b39dd761451a5ca8ff43e13dea43caaf3687cbffe7fabaa7bfd207633a7b7ab8e4623dd049b7daf62d25dad34646e1bf83cbaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-icsv-doc"
RDEPENDS:${PN} += ""

inherit rpm
