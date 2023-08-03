SUMMARY = "Documentation for texlive-circledsteps"
DESCRIPTION = "This package includes the documentation for texlive-circledsteps"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3.1svn63255"

RPM_NAME = "texlive-circledsteps-doc-2023.209.1.3.1svn63255-54.1.noarch.rpm"
RPM_HASH = "e26a135561589768f45a5783567cefecb240d3bfa09a932272ddcabe045e1b647c4f8447df31d7b38474f8afa57de334b999f208a88bf920a391fc3cd2c86fd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-circledsteps-doc"

RDEPENDS:${PN} += ""

inherit rpm
