SUMMARY = "Documentation for texlive-hvfloat"
DESCRIPTION = "This package includes the documentation for texlive-hvfloat"
LICENSE = "LPPL-1.0"

PV = "2023.208.2.45svn65671"

RPM_NAME = "texlive-hvfloat-doc-2023.208.2.45svn65671-53.1.noarch.rpm"
RPM_HASH = "d5bd07eba4869c70c27656118e13e15ebc349cec5ed259d499d08af944d7f1694c96df04f61c5d5b37246c1aeb8f3fdbe399e6ce44b8ad7fff8055dd53fb2056"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hvfloat-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
