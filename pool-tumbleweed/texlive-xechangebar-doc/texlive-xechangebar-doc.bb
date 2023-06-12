SUMMARY = "Documentation for texlive-xechangebar"
DESCRIPTION = "This package includes the documentation for texlive-xechangebar"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn54080"

RPM_NAME = "texlive-xechangebar-doc-2023.201.1.0svn54080-52.1.noarch.rpm"
RPM_HASH = "fa51c7f248a42b82a35c536979cb3a86ea49c3882d41d14aea80b7275a6dd3956735ffe1621eb4f9c10693e8596b6d1d8a676a5e1d456c54ce62158db87b3b55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xechangebar-doc"
RDEPENDS:${PN} += ""

inherit rpm
