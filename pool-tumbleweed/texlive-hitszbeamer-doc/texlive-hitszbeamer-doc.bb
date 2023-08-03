SUMMARY = "Documentation for texlive-hitszbeamer"
DESCRIPTION = "This package includes the documentation for texlive-hitszbeamer"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.0svn54381"

RPM_NAME = "texlive-hitszbeamer-doc-2023.209.1.0.0svn54381-54.1.noarch.rpm"
RPM_HASH = "e3e6823d0a4406a307166cd12c03dc3f208c5cd305cee8acb2c2e2f11b2390e97b87ce6154194741d9ede92d184a4468ac0ce6991b22fccb6f6e387ac5b0cbab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hitszbeamer-doc-zh \
texlive-hitszbeamer-doc"

RDEPENDS:${PN} += ""

inherit rpm
