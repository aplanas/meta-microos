SUMMARY = "Documentation for texlive-sansmathaccent"
DESCRIPTION = "This package includes the documentation for texlive-sansmathaccent"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn53628"

RPM_NAME = "texlive-sansmathaccent-doc-2023.209.svn53628-54.1.noarch.rpm"
RPM_HASH = "e3e6a65fd0e7896089e55d2c202a3c04daffb24125a0b36f64313b3e37aca09589b53fcc5ea722d8b231182c281eda0e8ef51e5561b3da6dbfa1a500cafb5a41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sansmathaccent-doc"

RDEPENDS:${PN} += ""

inherit rpm
