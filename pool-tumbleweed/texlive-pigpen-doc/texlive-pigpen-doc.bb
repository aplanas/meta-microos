SUMMARY = "Documentation for texlive-pigpen"
DESCRIPTION = "This package includes the documentation for texlive-pigpen"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn15878"

RPM_NAME = "texlive-pigpen-doc-2023.201.0.0.2svn15878-51.1.noarch.rpm"
RPM_HASH = "e27e908afce85cb78b3c6f45e7ac1b363759971324b116a4c40cde25040b98eea7e560d97bdab8525bf8c00cf43b9307c74a9c4f6ecf53b475fa2440eb2d7c61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pigpen-doc"

RDEPENDS:${PN} += ""

inherit rpm
