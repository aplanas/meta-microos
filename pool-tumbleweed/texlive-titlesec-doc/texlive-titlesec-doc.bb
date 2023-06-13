SUMMARY = "Documentation for texlive-titlesec"
DESCRIPTION = "This package includes the documentation for texlive-titlesec"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.14svn59845"

RPM_NAME = "texlive-titlesec-doc-2023.201.2.14svn59845-52.1.noarch.rpm"
RPM_HASH = "758655ff7a519048737d109191c8fac14baa3d50b01883ebe03bff7c3dfa2a2b8b148e6bc122f7dd507e981aa8a14b059df8e06973e7b9a2184b0f56f72ca3a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-titlesec-doc"

RDEPENDS:${PN} += ""

inherit rpm
