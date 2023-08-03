SUMMARY = "Documentation for texlive-mfnfss"
DESCRIPTION = "This package includes the documentation for texlive-mfnfss"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn46036"

RPM_NAME = "texlive-mfnfss-doc-2023.209.svn46036-55.1.noarch.rpm"
RPM_HASH = "3db25bf1a735e26ed601edd569000bd2cfb07d3284b3b794a5c58aa6ba023d07fe1675b3ed1de0ea25e884c4e05be5e21551e489805af0cad7af9401b2e7b89c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mfnfss-doc"

RDEPENDS:${PN} += ""

inherit rpm
