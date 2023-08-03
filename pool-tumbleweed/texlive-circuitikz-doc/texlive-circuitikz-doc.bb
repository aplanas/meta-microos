SUMMARY = "Documentation for texlive-circuitikz"
DESCRIPTION = "This package includes the documentation for texlive-circuitikz"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6.1svn65785"

RPM_NAME = "texlive-circuitikz-doc-2023.209.1.6.1svn65785-54.1.noarch.rpm"
RPM_HASH = "8db46af7c320d3e207049290e7bc2be36becba31c341a196664e60740de2616b9770f90367f9a314e8a80ff209b3327b2aa7983a7b0e80f57959e50e232de6f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-circuitikz-doc"

RDEPENDS:${PN} += ""

inherit rpm
