SUMMARY = "Documentation for texlive-pythonimmediate"
DESCRIPTION = "This package includes the documentation for texlive-pythonimmediate"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4.0svn66461"

RPM_NAME = "texlive-pythonimmediate-doc-2023.201.0.0.4.0svn66461-53.1.noarch.rpm"
RPM_HASH = "65698d680959c52c2c27f20ce4abfabb5ef01e77aa413fbc6f5087238a10f078eff2299e607a032e2a4b0e35e7f476b380aa830539646a6a48456ab2db3d79e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pythonimmediate-doc"
RDEPENDS:${PN} += ""

inherit rpm
