SUMMARY = "Documentation for texlive-shortmathj"
DESCRIPTION = "This package includes the documentation for texlive-shortmathj"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5.0svn54407"

RPM_NAME = "texlive-shortmathj-doc-2023.201.0.0.5.0svn54407-53.1.noarch.rpm"
RPM_HASH = "70ce2111a21d943d815c938575b27659549755db0245e1d21d6923acbdd4179ef5c825ae1cdc3b5479f661840daed1005aac53f0372a1d4b4e2ac80f13e32162"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-shortmathj-doc"
RDEPENDS:${PN} += ""

inherit rpm
