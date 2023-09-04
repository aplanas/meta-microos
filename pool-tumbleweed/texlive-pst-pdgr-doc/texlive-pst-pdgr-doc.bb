SUMMARY = "Documentation for texlive-pst-pdgr"
DESCRIPTION = "This package includes the documentation for texlive-pst-pdgr"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn45875"

RPM_NAME = "texlive-pst-pdgr-doc-2023.209.0.0.4svn45875-54.2.noarch.rpm"
RPM_HASH = "46150e53a5b9955ee222f8bec333e1d4c2a010abdf60a9dad9230c3d0fcff8ae47e7732906de7942e0dc88e45841f7f65ef2a15123de46889319d786d8d8aece"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-pdgr-doc"

RDEPENDS:${PN} += ""

inherit rpm
