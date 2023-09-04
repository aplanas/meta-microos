SUMMARY = "Documentation for texlive-xifthen"
DESCRIPTION = "This package includes the documentation for texlive-xifthen"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4.0svn38929"

RPM_NAME = "texlive-xifthen-doc-2023.209.1.4.0svn38929-53.2.noarch.rpm"
RPM_HASH = "a3c5458941391cd85b2b2329869336866e1fc92cb6922f8639e60b9895991f793d33f1adf4d3cd38d088e21b80299f3d1fb526c459387506efa6e0372d6c76b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xifthen-doc"

RDEPENDS:${PN} += ""

inherit rpm
