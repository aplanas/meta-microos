SUMMARY = "Documentation for texlive-gmdoc"
DESCRIPTION = "This package includes the documentation for texlive-gmdoc"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.993svn21292"

RPM_NAME = "texlive-gmdoc-doc-2023.209.0.0.993svn21292-54.1.noarch.rpm"
RPM_HASH = "51b0931aaaab12ce338b05bb8cad3b8f4b025f288e745a539f2a1e6323690067561947cdf349fdeec3f6c25d02a3bd115328a5c5fa64839e82280562def1ee4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gmdoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
