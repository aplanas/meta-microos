SUMMARY = "Documentation for texlive-tlc-article"
DESCRIPTION = "This package includes the documentation for texlive-tlc-article"
LICENSE = "BSD-3-Clause"

PV = "2023.209.1.0.17svn51431"

RPM_NAME = "texlive-tlc-article-doc-2023.209.1.0.17svn51431-53.1.noarch.rpm"
RPM_HASH = "e07d725f8992fd3958045e875e812ca6c4136be1de3478f985045793feb210ec94da3b64d90ced8913b96c7fb55e808d6a83d0418370a583156dd9c69c61569f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tlc-article-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
