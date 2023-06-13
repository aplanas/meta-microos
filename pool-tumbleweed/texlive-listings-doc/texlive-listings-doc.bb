SUMMARY = "Documentation for texlive-listings"
DESCRIPTION = "This package includes the documentation for texlive-listings"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.9svn66222"

RPM_NAME = "texlive-listings-doc-2023.201.1.9svn66222-54.1.noarch.rpm"
RPM_HASH = "85a43cf3433a5baf23e5a51dc0063b335a58fd5e442507a48b81e20cd074615375f21594f1b06bd025e24abba38b8f19c9e5c1b69cef2cdd9034f16752ace005"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-listings-doc"

RDEPENDS:${PN} += ""

inherit rpm
