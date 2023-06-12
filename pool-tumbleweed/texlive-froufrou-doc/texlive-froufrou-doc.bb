SUMMARY = "Documentation for texlive-froufrou"
DESCRIPTION = "This package includes the documentation for texlive-froufrou"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4.0svn59103"

RPM_NAME = "texlive-froufrou-doc-2023.201.1.4.0svn59103-52.1.noarch.rpm"
RPM_HASH = "bf1ad02124762ac43903ab9fd0369404bb54613a6bb83d10c4de3047593c7c522994fd1847cc70449fb16dee2549afbf4b9c7e8d5fa0ffb97e5f4e76c91980d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-froufrou-doc"
RDEPENDS:${PN} += ""

inherit rpm
