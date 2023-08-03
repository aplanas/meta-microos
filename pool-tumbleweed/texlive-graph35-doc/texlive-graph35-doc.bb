SUMMARY = "Documentation for texlive-graph35"
DESCRIPTION = "This package includes the documentation for texlive-graph35"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.3svn65138"

RPM_NAME = "texlive-graph35-doc-2023.209.0.0.1.3svn65138-54.1.noarch.rpm"
RPM_HASH = "7cef177a5d0257477316fa59237f1f2f94f0a7be8ca8d25ee7161b45691275c495c7a253112e123cc4c82bae47afd219b5e77b72638be0f814bc8a93df3c37de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-graph35-doc-fr \
texlive-graph35-doc"

RDEPENDS:${PN} += ""

inherit rpm
