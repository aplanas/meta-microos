SUMMARY = "Documentation for texlive-pst-marble"
DESCRIPTION = "This package includes the documentation for texlive-pst-marble"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn50925"

RPM_NAME = "texlive-pst-marble-doc-2023.209.1.6svn50925-53.1.noarch.rpm"
RPM_HASH = "8e16513888a42fce6064e26e116f28b9986575d2eee96745048e0eae6df93c6d3cbfacc6097b0336ca430149ad450f7528f2f69a66a2efde18d4fc0dfb1e87f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-marble-doc"

RDEPENDS:${PN} += ""

inherit rpm
