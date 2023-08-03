SUMMARY = "Documentation for texlive-latexfileinfo-pkgs"
DESCRIPTION = "This package includes the documentation for texlive-latexfileinfo-pkgs"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.22svn26760"

RPM_NAME = "texlive-latexfileinfo-pkgs-doc-2023.209.0.0.22svn26760-55.1.noarch.rpm"
RPM_HASH = "36668d538a1269f90744c7b9717a40ae306f7f06dbc7308057552cdbcb4cde86addf08267eb88a66ad506ddcabedffd1480453b75382e8bfec59f82c9d8f4e3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexfileinfo-pkgs-doc"

RDEPENDS:${PN} += ""

inherit rpm
