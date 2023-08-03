SUMMARY = "Documentation for texlive-modulus"
DESCRIPTION = "This package includes the documentation for texlive-modulus"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn47599"

RPM_NAME = "texlive-modulus-doc-2023.209.1.0svn47599-55.1.noarch.rpm"
RPM_HASH = "22708cbebfb76b0366de6ba15fbaba4710c5f0f7cc56b9d3fd4fd7667af0bd0718c0d25d32cdffbd9b4f9f8913c941bd8ca32aecdbedff8e6935306cae00a205"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-modulus-doc"

RDEPENDS:${PN} += ""

inherit rpm
