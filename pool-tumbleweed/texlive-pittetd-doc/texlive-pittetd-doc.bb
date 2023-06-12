SUMMARY = "Documentation for texlive-pittetd"
DESCRIPTION = "This package includes the documentation for texlive-pittetd"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.618svn15878"

RPM_NAME = "texlive-pittetd-doc-2023.201.1.618svn15878-51.1.noarch.rpm"
RPM_HASH = "b23a909511f06d477cb47e9ebe3181c0e37ce9875e6dc0e36ef039244fe7af7b603d7887eb5ec0529b6bd52b3d3d3ac481a6e262c50f1c17a281307831445ea2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pittetd-doc"
RDEPENDS:${PN} += ""

inherit rpm
