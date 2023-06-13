SUMMARY = "Documentation for texlive-pst-fractal"
DESCRIPTION = "This package includes the documentation for texlive-pst-fractal"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.12svn64714"

RPM_NAME = "texlive-pst-fractal-doc-2023.201.0.0.12svn64714-52.1.noarch.rpm"
RPM_HASH = "8b3e531725fc8fffa1947656822beb1cf7650d40e095971351419678bf0bf8920aa754a02041976959868e452d3f51899f2f6675d082304b977acdaf9b502eab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-fractal-doc"

RDEPENDS:${PN} += ""

inherit rpm
