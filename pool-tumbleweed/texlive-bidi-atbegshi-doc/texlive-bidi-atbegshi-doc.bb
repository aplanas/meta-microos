SUMMARY = "Documentation for texlive-bidi-atbegshi"
DESCRIPTION = "This package includes the documentation for texlive-bidi-atbegshi"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn62009"

RPM_NAME = "texlive-bidi-atbegshi-doc-2023.201.0.0.2svn62009-53.1.noarch.rpm"
RPM_HASH = "474b2f8d48e496a870ff7f2f38e70b0c1a0e6a37ac8484b0e533306968f04fcf55b6482473d25468ad88f603cad4771a8d412a027b63435b70da1b8b323acd97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bidi-atbegshi-doc"

RDEPENDS:${PN} += ""

inherit rpm
