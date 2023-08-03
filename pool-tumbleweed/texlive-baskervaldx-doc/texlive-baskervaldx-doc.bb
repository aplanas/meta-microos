SUMMARY = "Documentation for texlive-baskervaldx"
DESCRIPTION = "This package includes the documentation for texlive-baskervaldx"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.076svn57080"

RPM_NAME = "texlive-baskervaldx-doc-2023.209.1.076svn57080-54.1.noarch.rpm"
RPM_HASH = "5e82082c94b24715d203d80911ac1b7061b61768596bfae090edd529c39453a2d3618a8453de932d4210ab13bdf42824d621d3e613a3fd524a18e1c70a38e63e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-baskervaldx-doc"

RDEPENDS:${PN} += ""

inherit rpm
