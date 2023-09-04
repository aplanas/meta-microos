SUMMARY = "Documentation for texlive-hep-paper"
DESCRIPTION = "This package includes the documentation for texlive-hep-paper"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn64917"

RPM_NAME = "texlive-hep-paper-doc-2023.209.2.1svn64917-54.2.noarch.rpm"
RPM_HASH = "16d457d9637ccd8dcdede2cae2dbacbec498d4293dadc5ad6fee9317171ed22cf3870ac6db4ac71b45fbbf30922006a0cbdefc8bd8411d8420bb68d683eba590"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-paper-doc"

RDEPENDS:${PN} += ""

inherit rpm
