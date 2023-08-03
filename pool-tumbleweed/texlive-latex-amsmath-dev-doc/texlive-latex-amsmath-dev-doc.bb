SUMMARY = "Documentation for texlive-latex-amsmath-dev"
DESCRIPTION = "This package includes the documentation for texlive-latex-amsmath-dev"
LICENSE = "LPPL-1.0"

PV = "2023.209.20230501_pre_release_0svn64899"

RPM_NAME = "texlive-latex-amsmath-dev-doc-2023.209.20230501_pre_release_0svn64899-56.1.noarch.rpm"
RPM_HASH = "8b9144f1478fc1803d297b68b191efcb078eda7cff8aa7211d5f791a56b972a92650044f45c7862230b34348e3ad2437765bee7d7e65da5bf9d5e52716f1584f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-latex-amsmath-dev-doc-en \
texlive-latex-amsmath-dev-doc"

RDEPENDS:${PN} += ""

inherit rpm
