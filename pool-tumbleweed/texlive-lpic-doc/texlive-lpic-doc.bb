SUMMARY = "Documentation for texlive-lpic"
DESCRIPTION = "This package includes the documentation for texlive-lpic"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.8svn20843"

RPM_NAME = "texlive-lpic-doc-2023.209.0.0.8svn20843-55.1.noarch.rpm"
RPM_HASH = "72c0b97d87119b764a803dab5f34a3007f3093573e2f8ab058b745f8fe994b9de8baa253207bc834bf578e7ba242bf9cfd2b4e9ea1b5043cbb3a2ca27e7c7442"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lpic-doc"

RDEPENDS:${PN} += ""

inherit rpm
