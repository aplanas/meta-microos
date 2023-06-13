SUMMARY = "Documentation for texlive-flabels"
DESCRIPTION = "This package includes the documentation for texlive-flabels"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn17272"

RPM_NAME = "texlive-flabels-doc-2023.201.1.0svn17272-52.1.noarch.rpm"
RPM_HASH = "ff5eb5753f73b8fb8c3bef45f57f54a51487551172b6fd872e604dd734753838086985c5d54065580715a754c3202e18fb242520fe85d0e5ecb16f0db323aa73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-flabels-doc"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
