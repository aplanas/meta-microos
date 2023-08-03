SUMMARY = "Documentation for texlive-babel-samin"
DESCRIPTION = "This package includes the documentation for texlive-babel-samin"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0csvn30288"

RPM_NAME = "texlive-babel-samin-doc-2023.209.1.0csvn30288-54.1.noarch.rpm"
RPM_HASH = "8fc46680435d214e5631895393668eb6c4bb749b081d24c9df1914c65f76d6a550d10013496feb5f3e46546453a64f2e3237b95ff0d9cf9c56d1c5f0f3b101eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-samin-doc"

RDEPENDS:${PN} += ""

inherit rpm
