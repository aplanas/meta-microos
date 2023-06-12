SUMMARY = "Documentation for texlive-ifallfalse"
DESCRIPTION = "This package includes the documentation for texlive-ifallfalse"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0.0svn60027"

RPM_NAME = "texlive-ifallfalse-doc-2023.201.2.0.0svn60027-52.1.noarch.rpm"
RPM_HASH = "703a2b8934140a31a66b96af720c877dae412bc33d0fa510f2de51f1f1f28e4ab74c19927c45005c4d22e592e1aa8565ad50a603b9e5bb26f6726fe29b60ccf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ifallfalse-doc"
RDEPENDS:${PN} += ""

inherit rpm
